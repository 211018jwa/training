import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PasswordGeneratorComponent } from './password-generator/password-generator.component';
import { ImageViewerComponent } from './image-viewer/image-viewer.component';
import { DemoComponent } from './demo/demo.component';
import { PokeComponent } from './poke/poke.component';

@NgModule({
  declarations: [
    AppComponent,
    PasswordGeneratorComponent,
    ImageViewerComponent,
    DemoComponent,
    PokeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
