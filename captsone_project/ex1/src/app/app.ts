import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ex1');
   isPalindrome(str: string): boolean {
    let reversed = str.split('').reverse().join('');
    return str === reversed;
  }
}
