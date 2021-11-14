import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-copyrights',
  templateUrl: './copyrights.component.html',
  styleUrls: ['./copyrights.component.css']
})
export class CopyrightsComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  toHomePage() {
    this.router.navigateByUrl('home');
  }

  toExporterPage() {
    this.router.navigateByUrl('exporter');
  }

  toPokemonsPage() {
    this.router.navigateByUrl('pokemon');
  }
}
