import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { lastValueFrom, Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  constructor(private http: HttpClient) { }

  async getPokemons(): Promise<Observable<Pokemon>[]> { // async functions always return a Promise
    let observables: Observable<Pokemon>[] = [];

    let obj = await lastValueFrom(this.http.get<{ results: { name: string, url: string }[] }>('https://pokeapi.co/api/v2/pokemon?limit=100'));

    for (let e of obj.results) {
      observables.push(this.http.get<Pokemon>(e.url)); // Push all 100 HTTP request observables into the array
    }

    return observables;
  }
}
