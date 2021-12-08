import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {

  constructor() {
    console.log('constructor invoked for DemoComponent');
  }

  ngOnChanges() {
    console.log('ngOnChanges() invoked for DemoComponent');
  }

  ngOnInit(): void {
    console.log('ngOnInit() invoked for DemoComponent');
  }

  ngDoCheck() {
    console.log('ngDoCheck() invoked for DemoComponent');
  }

  ngOnDestroy() {
    console.log('ngOnDestroy() invoked for DemoComponent');
  }

}
