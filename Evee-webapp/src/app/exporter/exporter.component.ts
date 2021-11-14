import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-exporter',
  templateUrl: './exporter.component.html',
  styleUrls: ['./exporter.component.css']
})
export class ExporterComponent implements OnInit {
  rows = Array.from({ length: 100 }).map((_, i) => `Item #${i}`);

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
