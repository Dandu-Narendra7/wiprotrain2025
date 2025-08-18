import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-listmodel',
  imports: [FormsModule],
  templateUrl: './listmodel.html',
  styleUrl: './listmodel.css'
})
export class Listmodel {
  namesList:string[]=['mahesh','rajesh','narendra'];

}
