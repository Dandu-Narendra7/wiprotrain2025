import { Component } from '@angular/core';
import { Fruits } from "../fruits/fruits";

@Component({
  selector: 'app-home',
  imports: [Fruits],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  fruits=[
    {name: 'Apple', image: 'https://via.placeholder.com/150?text=Apple', description: 'Red and juicy' },
    {name: 'Banana', image: 'https://via.placeholder.com/150?text=Banana', description: 'Sweet and soft'},
    {name: 'Orange', image: 'https://via.placeholder.com/150?text=Orange', description: 'Citrusy and tangy' }
  ];

}
