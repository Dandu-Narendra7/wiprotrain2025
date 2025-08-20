import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-fruitlist',
  imports: [],
  templateUrl: './fruitlist.html',
  styleUrl: './fruitlist.css'
})
export class Fruitlist {
  fruits=[
    {name:'apple',image:'https://via.placeholder.com/150?text=Apple', description: 'Red in color' },
    {name:'banana',image:'https://via.placeholder.com/150?text=Banana', description: 'yellow in color,soft' },
    {name:'orange',image:'https://via.placeholder.com/150?text=Orange',description: 'Orange in color,soft'}    
  ];
}
