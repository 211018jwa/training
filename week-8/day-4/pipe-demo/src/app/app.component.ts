import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipe-demo';

  myVar: number = 0;

  milesPerHourInput: number = 0;
  kilometersPerHourInput: number = 0;
}
