import { Component, OnInit } from '@angular/core';
import { Pokemon } from '../Pokemon';

@Component({
  selector: 'app-structural-directives-demo',
  templateUrl: './structural-directives-demo.component.html',
  styleUrls: ['./structural-directives-demo.component.css']
})
export class StructuralDirectivesDemoComponent implements OnInit {

  paragraphElementDisplayed: boolean = true;

  currentTableToBeDisplayed: string = 'pending';

  pokemonData: Pokemon[] = []

  constructor() { }

  ngOnInit(): void {
    this.getPokemons();
  }

  async getPokemons() {
    try {
      let res = await fetch('https://pokeapi.co/api/v2/pokemon?limit=5', {
        method: 'GET'
      });

      let data = await res.json();

      let arrayOfEndpoints = data.results;
      for (let obj of arrayOfEndpoints) {
        let url = obj.url;
        this.getPokemon(url);
      }

    } catch(err) {
      console.log(err);
    }
  }

  async getPokemon(url: string) {
    try {
      let res = await fetch(url, {
        method: 'GET'
      });

      let data: Pokemon = await res.json();

      this.pokemonData.push(data);
    } catch(err) {
      console.log(err);
    }
  }

  onButtonClick() {
    this.paragraphElementDisplayed = !this.paragraphElementDisplayed;
  }

}
