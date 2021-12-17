import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { lastValueFrom, Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  constructor(private http: HttpClient) {
  }

  async getPokemon(): Promise<Observable<Pokemon>[]> {

    let observables: Observable<Pokemon>[] = [];
    // Turns observable into a Promise
    let responseObj = await lastValueFrom(this.http.get<{ results: { name: string, url: string }[]}>('https://pokeapi.co/api/v2/pokemon?limit=100'));

    // Send 100 http requests
    for (let urlObjs of responseObj.results) {
      observables.push(this.http.get<Pokemon>(urlObjs.url));
    }

    return observables;
  }
}
