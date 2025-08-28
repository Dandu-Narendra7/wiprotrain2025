import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-ex4sub',
  imports: [],
  templateUrl: './ex4sub.html',
  styleUrl: './ex4sub.css'
})
export class Ex4sub {
  registrationForm: FormGroup;
   subjects: string[] = ['Maths','GK', 'Science', 'History', 'English', 'Telugu'];

  constructor(private fb: FormBuilder) {
    this.registrationForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dob: ['', Validators.required],
      subject: ['', Validators.required], // Now entered manually
    });
  }

  onSubmit() {
    if (this.registrationForm.valid) {
      console.log('Form Data:', this.registrationForm.value);
      alert('Registration Successful!');
    }
  }

}
