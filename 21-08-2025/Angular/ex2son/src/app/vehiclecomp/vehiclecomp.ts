import { Component } from '@angular/core';
import { Ivehicle } from '../ivehicle';
import { Vehicleservice } from '../vehicleservice';

@Component({
  selector: 'app-vehiclecomp',
  imports: [],
  templateUrl: './vehiclecomp.html',
  styleUrl: './vehiclecomp.css'
})
export class Vehiclecomp {
  constructor(private vehicleservice:Vehicleservice){}
  vehicle:Ivehicle[]=[]
  ngOnInit(){
    this.vehicleservice>getvehicle
  }


}
