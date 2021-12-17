import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-component',
  templateUrl: './demo-component.component.html',
  styleUrls: ['./demo-component.component.css']
})
export class DemoComponentComponent implements OnInit {

  myVar: string = 'Some text';

  @Input()
  someVar: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  onInputChange(e: Event) {
    let inputElement: HTMLInputElement = <HTMLInputElement> e.target;
    this.myVar = inputElement.value;
  }

}
