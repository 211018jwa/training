import { ThrowStmt } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { lastValueFrom, Observable } from 'rxjs';
import { Pokemon } from 'src/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  // Sending HTTP requests in Angular
  // 1. Fetch
  // 2. HttpClient
  // Angular prefers HttpClient
  async getPokemons(): Promise<Observable<Pokemon>[]> {
    let pokemonObservables: Observable<Pokemon>[] = [];

    let obj: {
      results: {
        name: string,
        url: string
      }[]
    } = await lastValueFrom(this.http.get<{ results: { name: string, url: string }[]}>('https://pokeapi.co/api/v2/pokemon?limit=100'));

    for (let e of obj.results) {
      pokemonObservables.push(this.http.get<Pokemon>(e.url));
    }

    return pokemonObservables; // Async functions always
    // return the return value wrapped inside a Promise
  }

}
