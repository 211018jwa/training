import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from '../poke.service';

@Component({
  selector: 'app-json-viewer',
  templateUrl: './json-viewer.component.html',
  styleUrls: ['./json-viewer.component.css']
})
export class JsonViewerComponent implements OnInit {

  pokemon!: Pokemon;

  constructor(public pokeService: PokeService) { }

  ngOnInit(): void {
    this.pokeService.sub.subscribe((data) => {
      this.pokemon = data;
    })
  }

}
