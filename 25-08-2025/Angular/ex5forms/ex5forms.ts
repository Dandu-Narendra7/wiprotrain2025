import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-ex5forms',
  imports: [],
  templateUrl: './ex5forms.html',
  styleUrl: './ex5forms.css'
})
export class Ex5forms {
  fg:FormGroup
   constructor(private fb: FormBuilder) {
    this.fg = this.fb.group({
      fName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dob: ['', Validators.required],
      subjects: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.fg.valid) {
      console.log('Form submitted:', this.fg.value);
    }
  }
}




  


