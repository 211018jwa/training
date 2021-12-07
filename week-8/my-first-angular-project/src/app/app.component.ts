import { Component } from '@angular/core';

/* Decorators look like annotations */
/* They are a feature introduced in TypeScript */
/* The developers of Angular chose to use TypeScript,
and they also chose to use Decorators */
/* The way that the Angular team chose to use decorators was
to provide information about particular pieces of the
Angular app such as information about
  1. Components
  2. Modules
  3. Services
*/

/* Here we have a Component decorator that describes information about
the different files that should be utilized with this component
along with the tag that needs to be used to render this component */
/*
  "selector" property: indicates what tag you should use to display
  the component

  "templateUrl" property: points to the location of the .html file
  to be used for the component

  "styleUrls" property: contains a list of all of the different
  .css files that you would like to utilize for that particular component

*/
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css', './my-second-file.css']
})
export class AppComponent {
  title = 'my-first-angular-project';
}
