package com.springcoders.ECommerceManagment.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table
	public class Product {
		
		@Id
		private Long product_id;
		private String product_name;
		private Long product_price;
		private String product_type;
		
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		public Long getProduct_id() {
			return product_id;
		}
		public void setProduct_id(Long product_id) {
			this.product_id = product_id;
		}
		public Long getProduct_price() {
			return product_price;
		}
		public void setProduct_price(Long product_price) {
			this.product_price = product_price;
		}
		public String getProduct_type() {
			return product_type;
		}
		public void setProduct_type(String product_type) {
			this.product_type = product_type;
		}
		
	}



