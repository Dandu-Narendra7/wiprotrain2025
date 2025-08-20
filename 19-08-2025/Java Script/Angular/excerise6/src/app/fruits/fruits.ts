import { Component, Input } from '@angular/core';
import { IFruits } from '../ifruits';

@Component({
  selector: 'app-fruits',
  imports: [],
  templateUrl: './fruits.html',
  styleUrl: './fruits.css'
})
export class Fruits {
  @Input() fruits:IFruits | undefined;

}
