import { Component } from '@angular/core';
import { Fruitlist } from "../fruitlist/fruitlist";
import { Exercise2 } from "../exercise2/exercise2";

@Component({
  selector: 'app-home',
  imports: [ Exercise2],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

}
