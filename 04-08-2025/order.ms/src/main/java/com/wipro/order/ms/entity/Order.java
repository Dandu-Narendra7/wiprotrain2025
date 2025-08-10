package com.wipro.order.ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

	@Entity
	@Table(name="order_data")
	@Data
	public class Order {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		
		@Column(name="order_number")
		String orderNumber;
		
		@Column(name="order_value")
		double orderValue;
		
		@Column(name="order_status")
		String orderStatus;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
		}

		public double getOrderValue() {
			return orderValue;
		}

		public void setOrderValue(double orderValue) {
			this.orderValue = orderValue;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", orderNumber=" + orderNumber + ", orderValue=" + orderValue + ", orderStatus="
					+ orderStatus + "]";
		}
		
}

