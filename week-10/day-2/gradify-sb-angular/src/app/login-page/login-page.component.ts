import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/User';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  username!: string;
  password!: string;

  errorMessage!: string;

  constructor(private loginService: LoginService, private router: Router) {
  }

  ngOnInit(): void {

    // invoke check if logged in
    this.checkIfLoggedIn();

  }

  checkIfLoggedIn() {
    this.loginService.checkLoginStatus().subscribe((res) => {
      if (res.status === 200) {
        let body = <User> res.body;

        if (body.role.role === 'associate') {
          // navigate to associate route
          this.router.navigate(['associate']);
        }

        if (body.role.role === 'trainer') {
          // navigate to trainer route
          this.router.navigate(['trainer']);
        }
      }
    },
    (err) => {

    });
  }

  onButtonClick() {
    this.loginService.login(this.username, this.password).subscribe((res) => {
      if (res.status === 200) {
        let body = <User> res.body;

        if (body.role.role === 'associate') {
          // navigate to associate route
          this.router.navigate(['associate']);
        }

        if (body.role.role === 'trainer') {
          // navigate to trainer route
          this.router.navigate(['trainer']);
        }

      }
    }, (err) => {
      this.errorMessage = err.error;
    });
  }

}
