import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'one-way-databinding-app';
  appDemoDisplayed: boolean = true;

  onToggleButtonClick() {
    // Method 1:
    // if (this.appDemoDisplayed) {
    //   this.appDemoDisplayed = false
    // } else {
    //   this.appDemoDisplayed = true;
    // }

    // Method 2 (ternary expression (you can actually do this in Java as well))
    // this.appDemoDisplayed = (this.appDemoDisplayed === true) ? false : true;

    // Method 3
    this.appDemoDisplayed = !this.appDemoDisplayed;
  }
}
