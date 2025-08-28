import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-ex3control',
  imports: [],
  templateUrl: './ex3control.html',
  styleUrl: './ex3control.css'
})
export class Ex3control {
 inputControl = new FormControl('');
  reversedText: string = '';

  constructor() {
    this.inputControl.valueChanges.subscribe(value => {
      this.reversedText = this.reverseString(value || '');
    });
  }

  reverseString(str: string): string {
    return str.split('').reverse().join('');
  }
}

