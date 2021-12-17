import { Component, Input, OnInit } from '@angular/core';
import { Pokemon } from 'src/Pokemon';
import { PokeService } from '../poke.service';

@Component({
  selector: 'app-pokemon-card',
  templateUrl: './pokemon-card.component.html',
  styleUrls: ['./pokemon-card.component.css']
})
export class PokemonCardComponent implements OnInit {

  @Input()
  poke!: Pokemon;

  ngOnInit(): void {
  }

}
