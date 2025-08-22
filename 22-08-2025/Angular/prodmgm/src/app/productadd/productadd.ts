import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Productservice } from '../productservice';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-productadd',
  imports: [FormsModule],
  templateUrl: './productadd.html',
  styleUrl: './productadd.css'
})
export class Productadd {
  constructor(private productservice:Productservice,private router:Router) { }
  productName:string = '';
  productcategory: string='';
  productprice: number=0;


submit() {

  console.log('Adding product:', this.productName, this.productcategory,this.productprice);

  this.productservice.addProduct({
    name: this.productName,category:this.productcategory,price: this.productprice}).subscribe((response: any) => {
    console.log('product added successfully:', response);
    this.productName = '';
    this.productcategory='';
    this.productprice=0;
    this.router.navigate(['/productlist']); // Navigate to the products list after adding  the product

  }, (error: any) => {
    console.error('Error adding product:', error);
  });
}

}
