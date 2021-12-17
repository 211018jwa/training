import { Component } from '@angular/core';
import { lastValueFrom, Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from './poke.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'group-two-app';

  pokemons: Pokemon[] = [];

  ps: PokeService;

  // Dependency Injection
  // 1. Field
  // 2. Constructor
  // 3. Setter
  // Constructor injection is what Angular uses
  constructor(ps: PokeService) {
    this.ps = ps;
  }

  async ngOnInit() {
    let observables: Observable<Pokemon>[] = await this.ps.getPokemons();

    for (let obs of observables) {
      let pokemon = await lastValueFrom(obs);

      this.pokemons.push(pokemon);
    }
  }
}
