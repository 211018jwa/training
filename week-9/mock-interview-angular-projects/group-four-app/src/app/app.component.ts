import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { observeNotification } from 'rxjs/internal/Notification';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from './poke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'group-four-app';

  h1IsDisplayed: boolean = true;

  strings: string[] = ['first string', 'second string', 'third string', 'fourth string'];

  pokemons: Pokemon[] = [];

  onToggleButtonClick() {
    this.h1IsDisplayed = !this.h1IsDisplayed;
  }

  constructor(private pokeService: PokeService) {
  }

  async ngOnInit() {
    let pokemonObservables: Observable<Pokemon>[] = await this.pokeService.getPokemon();

    for (let obs of pokemonObservables) {
      obs.subscribe((poke) => {
        this.pokemons.push(poke);
      })
    }
  }

}
