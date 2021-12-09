import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';
import { Pokemon } from 'src/Pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokeService {

  client!: HttpClient;

  sub: Subject<Pokemon> = new Subject();

  constructor(httpClient: HttpClient) {
    this.client = httpClient;
  }

  sendRequest(id: number) {
    this.client.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${id}`, {
      // withCredentials: true
    }).subscribe((data) => {
      this.sub.next(data); // We are publishing new data to the subject
    })
  }
}
