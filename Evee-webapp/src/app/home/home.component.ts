import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  russianPassport = false;
  otherPassport = false;
  luggageToggle = true;
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

  private alternateLuggageToggle() {

  }

  luggageToggleRule() {
    this.luggageToggle = !this.luggageToggle;
  }

  checkingToggleRule(){
    this.checkinToggle = !this.checkinToggle;
  }
}
