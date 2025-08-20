import { NgClass } from '@angular/common';
import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [NgClass],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('excerise3');
  isActive = true;
  isError = false;

  getNgClass() {
    return {
      'active-class': this.isActive,
      'error-class': this.isError
    };
  }

}
