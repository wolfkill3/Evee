import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  russianPassport = false;
  otherPassport = false;
  luggageNo = false;
  luggageFirst = false;
  luggageSecond = false;
  checkinToggle = true;

  russianPassportToggleRule() {
      this.russianPassport = true;
      this.otherPassport = false;
  }

  otherPassportToggleRule() {
      this.russianPassport = false;
      this.otherPassport = true;
  }

  luggageNoToggleRule() {
      this.luggageNo = true;
      this.luggageFirst = false
      this.luggageSecond = false
  }

  luggageFirstToggleRule() {
      this.luggageNo = false;
      this.luggageFirst = true
      this.luggageSecond = false
  }

  luggageSecondToggleRule() {
      this.luggageNo = false;
      this.luggageFirst = false;
      this.luggageSecond = true
  }

  checkingToggleRule(){
    this.checkinToggle = !this.checkinToggle;
  }

  constructor(private router: Router) {
  }

  toExporterPage() {
    this.router.navigateByUrl('exporter');
  }

  toCopyrightsPage() {
    this.router.navigateByUrl('copyrights');
  }

  toPokemonsPage() {
    this.router.navigateByUrl('pokemon');
  }
}
