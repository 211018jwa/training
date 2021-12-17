import { Component, Input, OnInit } from '@angular/core';
import { Pokemon } from 'src/Pokemon';

@Component({
  selector: 'app-pokemon-card',
  templateUrl: './pokemon-card.component.html',
  styleUrls: ['./pokemon-card.component.css']
})
export class PokemonCardComponent implements OnInit {

  @Input() // Created a pokemon attribute
  pokemon!: Pokemon;

  constructor() { }

  ngOnInit(): void {
  }

}
