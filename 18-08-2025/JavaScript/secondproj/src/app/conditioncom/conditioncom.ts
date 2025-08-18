import { Component } from '@angular/core';

@Component({
  selector: 'app-conditioncom',
  imports: [],
  templateUrl: './conditioncom.html',
  styleUrl: './conditioncom.css'
})
export class Conditioncom {
  // flag:boolean=true;
  // message(){
  //   this.flag=false;
  //   }
  countries:string[]=["India","China","USA","Russia"];
    dropdownCountries:string[]=[];
    loadCountries(){
      this.dropdownCountries=this.countries;
    }
  }


