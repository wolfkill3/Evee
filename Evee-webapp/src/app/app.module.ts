import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PokemonComponent } from 'src/app/pokemon/pokemon.component';
import { HoverDirective } from 'src/app/hover.directive';

@NgModule({
  declarations: [
    AppComponent,
    PokemonComponent,
    HoverDirective,
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {
}
