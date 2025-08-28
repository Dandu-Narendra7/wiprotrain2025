import { Component, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatStepperModule } from '@angular/material/stepper';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@Component({
  selector: 'app-ex2form',
  imports: [FormsModule, 
    ReactiveFormsModule,
    MatStepperModule,
    MatInputModule,
    MatButtonModule],
  templateUrl: './ex2form.html',
  styleUrl: './ex2form.css'
})
export class Ex2form {
  nameForm: FormGroup;
  ageForm: FormGroup;
  emailForm: FormGroup;

  constructor(private fb: FormBuilder) {
  this.nameForm = this.fb.group({ name: [''] });
  this.ageForm = this.fb.group({ age: [''] });
  this.emailForm = this.fb.group({ email: [''] });
  }

}
