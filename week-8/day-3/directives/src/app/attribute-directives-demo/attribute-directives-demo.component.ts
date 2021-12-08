import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directives-demo',
  templateUrl: './attribute-directives-demo.component.html',
  styleUrls: ['./attribute-directives-demo.component.css']
})
export class AttributeDirectivesDemoComponent implements OnInit {

  toggleIsActive: boolean = false;

  pColor: string = 'blue';
  fontSize: string = '24px';

  constructor() { }

  ngOnInit(): void {
  }

}
