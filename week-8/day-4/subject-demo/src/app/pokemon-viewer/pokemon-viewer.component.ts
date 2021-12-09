import { Component, OnInit } from '@angular/core';
import { PokeService } from '../poke.service';

@Component({
  selector: 'app-pokemon-viewer',
  templateUrl: './pokemon-viewer.component.html',
  styleUrls: ['./pokemon-viewer.component.css']
})
export class PokemonViewerComponent implements OnInit {

  imageLink: string = '';
  pokemonId: number = 0;

  pokeService!: PokeService;

  constructor(pokeService: PokeService) {
    this.pokeService = pokeService;
  }

  ngOnInit(): void {
    this.pokeService.sub.subscribe((data) => {
      this.imageLink = data.sprites.front_default;
    })
  }

  onButtonClick() {
    this.pokeService.sendRequest(this.pokemonId); // void return type
  }

}
