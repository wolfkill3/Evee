import { Component, Input } from '@angular/core';
import { Pokemon } from 'src/app/pokemon/pokemon';
import { PokemonService } from 'src/app/pokemon/pokemon.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pokemon',
  templateUrl: 'pokemon.component.html',
  styleUrls: ['pokemon.component.css'],
})
export class PokemonComponent {
  pokedexUrl = 'https://www.pokemon.com/ru/pokedex/';
  pokemons: Pokemon[] = [];
  @Input()
  pokemon!: Pokemon;

  constructor(private pokemonService: PokemonService, private router: Router) {
    this.pokemons = this.pokemonService.pokemons;
  }

  toCheckPassPage() {
    this.router.navigateByUrl('home');
  }
}
