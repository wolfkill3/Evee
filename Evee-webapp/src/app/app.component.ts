import { Component } from '@angular/core';
import { PokemonService } from 'src/app/pokemon/pokemon.service';
import { Pokemon } from 'src/app/pokemon/pokemon';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PokemonService],
})
export class AppComponent {
  eveeTitle = 'Evee-webapp';
  pokemons: Pokemon[] = [];

  constructor(private pokemonService: PokemonService) {
  }

  ngOnInit() {
    this.pokemons = this.pokemonService.pokemons;
  }

}
