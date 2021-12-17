import { Component } from '@angular/core';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from './poke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'group-one-app';

  imageLink = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png'

  shouldBeDisplayed: boolean = true;

  constructor(private ps: PokeService) {
  }

  // gets called when the component is in the DOM
  async ngOnInit() {
    let observables = await this.ps.getPokemons();

    for (let obs of observables) {
      obs.subscribe((data) => {
        this.pokemons.push(data);
      })
    }
  }

  pokemons: Pokemon[] = [
  ];

  btnClick() {
    // change shouldBeDisplayed to false
    // if it is true
    // and to true if it is false
    this.shouldBeDisplayed = !this.shouldBeDisplayed;
  }
}
