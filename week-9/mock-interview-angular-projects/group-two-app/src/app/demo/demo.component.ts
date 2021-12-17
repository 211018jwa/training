import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {

  myVar: string = '';

  @Input()
  myVar2: string = '';

  constructor() { }

  ngOnInit(): void {
  }

}
