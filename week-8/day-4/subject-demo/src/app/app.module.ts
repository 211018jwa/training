import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PokemonViewerComponent } from './pokemon-viewer/pokemon-viewer.component';
import { PokemonHistoryComponent } from './pokemon-history/pokemon-history.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { JsonViewerComponent } from './json-viewer/json-viewer.component';

@NgModule({
  declarations: [
    AppComponent,
    PokemonViewerComponent,
    PokemonHistoryComponent,
    JsonViewerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
