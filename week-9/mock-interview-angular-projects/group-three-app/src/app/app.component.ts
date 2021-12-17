import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from './poke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  pokemons: Pokemon[] = [];

  // Dependency injection
  // Angular uses constructor injection
  constructor(public ps: PokeService) {
  }

  async ngOnInit() {
    let observables: Observable<Pokemon>[] = await this.ps.getPokemon();

    // Subscribe to all 100 observables inside of the array
    for (let obs of observables) {
      obs.subscribe((pokemon) => {
        this.pokemons.push(pokemon);
      })
    }
  }

  h1ShouldBeDisplayed: boolean = true;
  toggleBooleanValue() {
    if (this.h1ShouldBeDisplayed) { // it was true
      this.h1ShouldBeDisplayed = false;
    } else { // it was false
      this.h1ShouldBeDisplayed = true;
    }
  }
}
