import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Productservice } from '../productservice';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-produclist',
  imports: [RouterLink,FormsModule],
  templateUrl: './produclist.html',
  styleUrl: './produclist.css'
})
export class Produclist implements OnInit {
[x: string]: any;
  constructor(private productservice:Productservice,private router:Router){
  }
    ngOnInit() {
    console.log("==> productlist Component Initialized");
    this.productservice.getProducts().subscribe((data: Product[]) => {
      this['Products'] = [...data];
      console.log('products fetched successfully:', data);
    }, (error) => {
      console.error('Error fetching products:', error);
    });

}

  addproduct() {
    this.router.navigate(['/productadd']);

  }
}


