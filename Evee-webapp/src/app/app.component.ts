import { Component } from '@angular/core';
import { Pokemon } from 'src/app/pokemon/pokemon';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Evee-webapp';

  pokemons: Pokemon[] = [
    new Pokemon(
      'Eevee',
      'https://assets.pokemon.com/assets/cms2/img/pokedex/full/133.png',
      'Иви — маленький коренастый четвероногий покемон коричневого окраса и с очень милой внешностью.',
    ),
    new Pokemon(
      'Bulbasaur',
      'https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png',
      'Бульбаза́вр — стартовый покемон двойного травяного/ядовитого типа из первого поколения.',
    ),
    new Pokemon(
      'Pikachu',
      'https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png',
      'Пикачу — самый известный и популярный среди всех Покемонов.',
    ),
    new Pokemon(
      'Squirtle',
      'https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png',
      'Сквиртл — стартовый покемон водного типа из первого поколения покемонов.',
    )
  ];
}
