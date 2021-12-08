import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { OneWayDbDemoComponent } from './one-way-db-demo/one-way-db-demo.component';
import { TwoWayDbDemoComponent } from './two-way-db-demo/two-way-db-demo.component';
import { KeyboardDemoComponent } from './keyboard-demo/keyboard-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    OneWayDbDemoComponent,
    TwoWayDbDemoComponent,
    KeyboardDemoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
