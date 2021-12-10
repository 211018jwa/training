import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usernameInput!: string;
  passwordInput!: string;

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  onLoginButtonClick() {
    this.authService.login(this.usernameInput, this.passwordInput).subscribe(
      (user) => {
        if (user.userRole === 'trainer') {
          this.router.navigateByUrl('/trainer');
        } else if (user.userRole === 'associate') {
          this.router.navigateByUrl('/associate');
        }
      }
    );
  }

}
