import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-addition-history',
  templateUrl: './addition-history.component.html',
  styleUrls: ['./addition-history.component.css']
})
export class AdditionHistoryComponent implements OnInit {

  @Input('h')
  history: string[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
