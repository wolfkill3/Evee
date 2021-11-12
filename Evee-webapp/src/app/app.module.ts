import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PokemonComponent } from 'src/app/pokemon/pokemon.component';
import { HoverDirective } from 'src/app/hover.directive';
import { LoginComponent } from 'src/app/login/login.component';
import { HomeComponent } from 'src/app/home/home.component';
import { MaskedDirective } from 'src/app/masked.directive';

@NgModule({
  declarations: [
    AppComponent,
    PokemonComponent,
    LoginComponent,
    HomeComponent,
    //Директивы
    HoverDirective,
    MaskedDirective,
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {
}
