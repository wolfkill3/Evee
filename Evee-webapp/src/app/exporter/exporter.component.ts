import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-exporter',
  templateUrl: './exporter.component.html',
  styleUrls: ['./exporter.component.css']
})
export class ExporterComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  toHomePage() {
    this.router.navigateByUrl('home');
  }

  toCopyrightsPage() {
    this.router.navigateByUrl('copyrights');
  }

  toPokemonsPage() {
    this.router.navigateByUrl('pokemon');
  }
}
