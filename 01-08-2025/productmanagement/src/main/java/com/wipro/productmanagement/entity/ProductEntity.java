package com.wipro.productmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		String productName;
		String productMake;
		double productPrice;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductMake() {
			return productMake;
		}
		public void setProductMake(String productMake) {
			this.productMake = productMake;
		}
		public double getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		@Override
		public String toString() {
			return "ProductEntity [id=" + id + ", productName=" + productName + ", productMake=" + productMake
					+ ", productPrice=" + productPrice + "]";
		}
		
		

}
