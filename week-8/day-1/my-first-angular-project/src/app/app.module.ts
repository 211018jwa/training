import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SampleComponent } from './sample/sample.component';


/*
  The NgModule decorator contains various properties such as
  1. declarations: this will be an array of components, directives,
    and pipes that belong to the module
  2. imports: if we have other modules, we can import them in order
    to make use of any components, directives, or pipes that belong
    to that module inside of the current module
  3. exports: a list of components, directives or pipes that you
    would like to be available to other modules that import this module
  4. providers: deprecated, no longer really used
  5. bootstrap (only for AppModule): initially used to bootstrap
    the AppComponent to be rendered to the DOM
*/
@NgModule({
  declarations: [
    AppComponent,
    SampleComponent
  ],
  imports: [
    BrowserModule
  ],
  exports: [],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
