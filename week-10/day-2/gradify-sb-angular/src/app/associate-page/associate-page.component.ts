import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Assignment } from 'src/Assignment';
import { AssignmentService } from '../assignment.service';
import { LoginService } from '../login.service';
import { QuoteService } from '../quote.service';

@Component({
  selector: 'app-associate-page',
  templateUrl: './associate-page.component.html',
  styleUrls: ['./associate-page.component.css']
})
export class AssociatePageComponent implements OnInit {

  assignments: Assignment[] = [];

  dailyQuote!: string;

  constructor(private quoteService: QuoteService, private loginService: LoginService, private router: Router, private as: AssignmentService) { }

  ngOnInit(): void {

    this.as.getAssignments().subscribe((res) => {
      if (res.status === 200) {
        let body = <Assignment[]> res.body;

        this.assignments = body;
      }
    })

    this.quoteService.getDailyQuote().subscribe((res) => {
      let responseObj = <{ quoteText: string }> res;

      this.dailyQuote = responseObj.quoteText;
    })

  }

  onButtonClick() { // clicking logout button
    console.log('testing');

    this.loginService.logout().subscribe((res) => {
      console.log(res);

      if (res.status === 200) {
        this.router.navigate(['/']);
      }
    }, (err) => {

    });
  }

}
