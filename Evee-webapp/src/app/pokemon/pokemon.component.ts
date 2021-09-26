import { Component, Input } from '@angular/core';
import { Pokemon } from 'src/app/pokemon/pokemon';

@Component({
  selector: 'app-pokemon',
  templateUrl: 'pokemon.component.html',
})
export class PokemonComponent {
  pokedexUrl = 'https://www.pokemon.com/ru/pokedex/'
  @Input()
  pokemon!: Pokemon;
}
