import { Component } from '@angular/core';
import { PokeService } from './poke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'service-demo';

  imageLink: string = '';

  pokemonId: number = 0;

  pokemonService!: PokeService;

  constructor(pokeService: PokeService) {
    this.pokemonService = pokeService;
  }

  getPokemonImageLink() {
    this.pokemonService.getPokemon(this.pokemonId).subscribe((data) => {
      this.imageLink = data.sprites.front_default;
    });
  }
}
