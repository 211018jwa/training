import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.css']
})
export class AdditionComponent implements OnInit {

  numberOne: number = 0;
  numberTwo: number = 0;
  result: number = 0;

  @Output('add') // 'add' is the name of the custom event that we can bind to in the parent component
  newHistory = new EventEmitter<string>();

  constructor() { }

  ngOnInit(): void {
  }

  addNumbers() {
    this.result = this.numberOne + this.numberTwo;

    // Emitting an event from the component
    // The event object is the string itself that we are passing into the emit function
    this.newHistory.emit(`${this.numberOne} + ${this.numberTwo} is ${this.result}`);
  }

}
