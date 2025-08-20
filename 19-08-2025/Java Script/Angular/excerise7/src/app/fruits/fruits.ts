import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IFruits } from '../ifruits';
@Component({
  selector: 'app-fruits',
  imports: [],
  templateUrl: './fruits.html',
  styleUrl: './fruits.css'
})
export class Fruits {
@Input() fruits:IFruits={
    name: '',
    price: 0,
    description: '',
    image: ''
};
  @Output() btnClick = new EventEmitter<string>();

  onClick(fruitName: string) {
    console.log("Clicked - " + fruitName);
    this.btnClick.emit(fruitName);
  }


}
