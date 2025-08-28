import { Component, signal } from '@angular/core';
import { MatListModule } from '@angular/material/list';
import { Ex2form } from "./ex2form/ex2form";

@Component({
  selector: 'app-root',
  imports: [MatListModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ex1city');
   cities: string[] = ['New York', 'London', 'Paris', 'Tokyo', 'Sydney'];
}
