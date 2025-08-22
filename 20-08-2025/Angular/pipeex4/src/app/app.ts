import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ex4 } from './ex4';

@Component({
  selector: 'app-root',
  imports: [Ex4],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipeex4');
}
