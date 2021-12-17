import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { lastValueFrom, Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  // Injecting HttpClient into PokeService
  constructor(private http: HttpClient) { }

  async getPokemon(): Promise<Observable<Pokemon>[]> {
    let pokemonObservables: Observable<Pokemon>[] = [];

    let listOfUrls: { results: {name: string, url: string }[] } =
      await lastValueFrom(this.http.get<{ results: {name: string, url: string }[] }>('https://pokeapi.co/api/v2/pokemon?limit=100'));

    for (let obj of listOfUrls.results) {
      let res: Observable<Pokemon> = this.http.get<Pokemon>(obj.url)
      pokemonObservables.push(res);
    }

    return pokemonObservables;
  }

}

