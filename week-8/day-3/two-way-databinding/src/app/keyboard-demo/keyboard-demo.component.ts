import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-keyboard-demo',
  templateUrl: './keyboard-demo.component.html',
  styleUrls: ['./keyboard-demo.component.css']
})
export class KeyboardDemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  onKeyUp(event: Event) {
    console.log('keyUp event occurred');

    let e = <KeyboardEvent> event;
    if (e.keyCode === 13) {
      console.log('enter key pressed');
    }
  }

}
