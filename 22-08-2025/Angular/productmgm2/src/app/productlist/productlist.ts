import { Component } from '@angular/core';
import { Product } from '../product';
import { Router, RouterLink } from '@angular/router';
import { Productservice } from '../productService';



@Component({
  selector: 'app-productlist',
  imports: [RouterLink],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist {
  constructor(private productService: Productservice, private router: Router) { }

  products: Product[] = [];

  ngOnInit() {
    console.log("==> Productlist Component Initialized");
    this.productService.getProducts().subscribe((data: Product[]) => {
      this.products = data;
      console.log('Products fetched successfully:', data);
    }, (error: any) => {
      console.error('Error fetching products:', error);
    });
  }

  addProduct() {
    this.router.navigate(['/productadd']);
  }

}
