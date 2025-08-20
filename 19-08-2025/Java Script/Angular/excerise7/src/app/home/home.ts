import { Component } from '@angular/core';
import { Fruits } from '../fruits/fruits';
import { IFruits } from '../ifruits';

@Component({
  selector: 'app-home',
  imports: [Fruits],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  fruits:IFruits[]=[
     {
      name: 'Apple',
      price: 100,
      description: 'Fresh and crispy red apples.',
      image: 'https://via.placeholder.com/100x100?text=Apple'
    },
    {
      name: 'Banana',
      price: 50,
      description: 'Sweet and ripe bananas.',
      image: 'https://via.placeholder.com/100x100?text=Banana'
    },
    {
      name: 'Mango',
      price: 80,
      description: 'Juicy tropical mangoes.',
      image: 'https://via.placeholder.com/100x100?text=Mango'
    }
    
  ];
    remove(fruitName: string) {
    console.log("Remove button clicked - " + fruitName);
    this.fruits = this.fruits.filter(f => f.name !== fruitName);
  }


}
