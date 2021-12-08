import { Component, OnInit } from '@angular/core';
import { NumberValueAccessor } from '@angular/forms';
import { Pokemon } from '../Pokemon';

@Component({
  selector: 'app-poke',
  templateUrl: './poke.component.html',
  styleUrls: ['./poke.component.css']
})
export class PokeComponent implements OnInit {

  // We have a pokemonToBeDisplayedVariable of the type "Pokemon" (defined in the Pokemon interface)
  // We import that Pokemon interface from another file we called Pokemon.ts
  // We then assign an initial object with dummy values before we actually do a get request
  // And populate the actual Pokemon information
  pokemonToBeDisplayed: Pokemon = { id: 0, name: '', weight: 0, sprites: { front_default: '' } };

  constructor() { }

  ngOnInit(): void {
    this.getPokemonInformation();
  }

  async getPokemonInformation() {
    try {
      let res = await fetch('https://pokeapi.co/api/v2/pokemon/10', {
        method: 'GET'
      });

      let data = await res.json();

      this.pokemonToBeDisplayed = data;
    } catch(err) {
      console.log(err);
    }
  }

}
