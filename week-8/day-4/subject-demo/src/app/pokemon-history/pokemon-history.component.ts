import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from '../poke.service';

@Component({
  selector: 'app-pokemon-history',
  templateUrl: './pokemon-history.component.html',
  styleUrls: ['./pokemon-history.component.css']
})
export class PokemonHistoryComponent implements OnInit {

  pokeService!: PokeService;

  pokemonData: Pokemon[] = [];

  constructor(pokeService: PokeService) {
    this.pokeService = pokeService;
  }

  ngOnInit(): void {
    this.pokeService.sub.subscribe((data) => {
      this.pokemonData.push(data);
    });

  }

}
