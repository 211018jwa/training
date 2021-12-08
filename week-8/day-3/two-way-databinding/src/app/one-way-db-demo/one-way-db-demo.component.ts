import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-one-way-db-demo',
  templateUrl: './one-way-db-demo.component.html',
  styleUrls: ['./one-way-db-demo.component.css']
})
export class OneWayDbDemoComponent implements OnInit {

  inputValue: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  onInputChange(event: Event) {
    let element = <HTMLInputElement> event.target; // This is the property that gives you access
    // to the element that the event occurred on

    this.inputValue = element.value;
  }

}
