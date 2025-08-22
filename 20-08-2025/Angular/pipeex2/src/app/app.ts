import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [FormsModule,BrowserModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipeex2');
  Text: string='';
}
