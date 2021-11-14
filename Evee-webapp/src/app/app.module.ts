import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { Routes, RouterModule, Router } from '@angular/router';

import { AppComponent } from './app.component';
import { PokemonComponent } from 'src/app/pokemon/pokemon.component';
import { HoverDirective } from 'src/app/hover.directive';
import { LoginComponent } from 'src/app/login/login.component';
import { HomeComponent } from 'src/app/home/home.component';
import { MaskedDirective } from 'src/app/masked.directive';
import { DefaultpageComponent } from './defaultpage/defaultpage.component';
import { ExporterComponent } from './exporter/exporter.component';
import { CopyrightsComponent } from './copyrights/copyrights.component';

const appRoutes: Routes = [
  {
    path: '' ,
    redirectTo:'/login',
    pathMatch:'full'
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'exporter',
    component: ExporterComponent,
  },
  {
    path: 'copyrights',
    component: CopyrightsComponent,
  },
  {
    path: 'pokemon',
    component: PokemonComponent,
  },
];

@NgModule({
  declarations: [
    AppComponent,
    PokemonComponent,
    LoginComponent,
    HomeComponent,
    //Директивы
    HoverDirective,
    MaskedDirective,
    DefaultpageComponent,
    ExporterComponent,
    CopyrightsComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {
  constructor(private router: Router) {
  }

  go(){
    //this.router.navigate(['/page']);
  }
}
