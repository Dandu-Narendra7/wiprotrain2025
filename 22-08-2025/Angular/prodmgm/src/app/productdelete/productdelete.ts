import { Component } from '@angular/core';
import { Productservice } from '../productservice';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-productdelete',
  imports: [],
  templateUrl: './productdelete.html',
  styleUrl: './productdelete.css'
})
export class Productdelete {
  id:string | null = null;
  ProductService: any;
  constructor(private activeRoute:ActivatedRoute,private productservice:Productservice,private router:Router ){}
   ngOnInit() {
         this.id = this.activeRoute.snapshot.paramMap.get('id');
         console.log("product to be deleted has id:", this.id);
         this.ProductService.deleteProduct(this.id!).subscribe((response: any) => {
           console.log('Product deleted successfully');
           this.router.navigate(['/Productlist']); // Navigate to the Product list after deletion
           // Logic to navigate back to Product list or show a success message
         }  , (error: any) => {
           console.error('Error deleting Product:', error);
           // Logic to handle error, e.g., show an error message
         }  );
   }

}
