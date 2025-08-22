import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Product } from '../product';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit {
  
  constructor(private activatedRoute:ActivatedRoute,
    private productservice:Productservice,
    private router:Router

  ) {}
  id:string | null = null;
  product:Product = {

    name: '',
    category:'',
    price:0
    
  };
  ngOnInit()
  {
      console.log("==> Productedit Component Initialized");
      // Get the product ID from the route parameters
     this.id = this.activatedRoute.snapshot.paramMap.get('id');
      if (this.id) {
        this.productservice.findProduct(this.id).subscribe(product => {
          // Handle the product data here, e.g., populate a form
          console.log(product);
          this.product = product;
        });
      }
    }
     save()
     {
      this.productservice.saveProduct(this.product).subscribe({
        next: (product) => {
          console.log('product saved successfully:', product);
          this.router.navigate(['/productlist']); // Navigate to the products list after saving

        },
        error: (error) => {
          console.error('Error saving product:', error);
          // Handle the error, e.g., show an error message
        }
     });
    }

}
