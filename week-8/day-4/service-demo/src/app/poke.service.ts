import { Injectable } from '@angular/core';
import { Pokemon } from 'src/Pokemon';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  client!: HttpClient;

  constructor(httpClient: HttpClient) {
    this.client = httpClient;
  }

  getPokemon(id: number): Observable<Pokemon> {

      let res = this.client.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${id}`, {
        // withCredentials: true // This will be used if you need to utilize login functionality
      });

      return res; // An async function will always wrap the return type into a Promise
      // So we will actually not be returning Pokemon, but Promise<Pokemon>
      // On the other side, we would then need to await the promise
  }
}
