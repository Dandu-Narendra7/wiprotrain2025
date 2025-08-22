import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { Productservice } from '../productService';
import { OrderService } from '../order-service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ordercomp',
  imports: [FormsModule],
  templateUrl: './ordercomp.html',
  styleUrl: './ordercomp.css'
})
export class Ordercomp implements OnInit {
  products: Product[] = [];
  selectedProductId: number | null = null;
  purchaseQty: number = 0;
  message: string = '';

  constructor(private productService: Productservice, private orderService: OrderService) {}

  ngOnInit(): void {
    this.productService.getProducts().subscribe(data => {
      this.products = data;
    });
  }

  selectedProduct(): Product | undefined {
    return this.products.find(p => p.id === this.selectedProductId!);
  }

  placeOrder() {
    const product = this.selectedProduct();
    if (!product) {
      this.message = "Please select a product!";
      return;
    }
    if (this.purchaseQty <= 0) {
      this.message = "Quantity must be greater than 0.";
      return;
    }
    if (this.purchaseQty > product.qty) {
      this.message = "Cannot order more than available quantity.";
      return;
    }

    this.orderService.placeOrder(product.id!, this.purchaseQty).subscribe({
      next: () => {
        this.message = "Order placed successfully!";
        product.qty -= this.purchaseQty;      // reflect new stock
        this.purchaseQty = 0;
      },
      error: (err) => {
        console.error(err);
        this.message = err?.error ?? "Error placing order";
      }
    });
  }

}
