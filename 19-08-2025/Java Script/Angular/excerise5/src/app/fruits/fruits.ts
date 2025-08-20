import { Component, Input } from '@angular/core';
import { Home } from "../home/home";

@Component({
  selector: 'app-fruits',
  imports: [Home],
  templateUrl: './fruits.html',
  styleUrl: './fruits.css'
})
export class Fruits {
  @Input() name:any ='';
  @Input() image:any ='';
  @Input() description:any ='';

}
