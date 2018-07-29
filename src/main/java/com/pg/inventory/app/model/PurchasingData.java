package com.pg.inventory.app.model;

public class PurchasingData{

	private String product;
	private String nursery;
	private Integer quantity;
	private Float totalPrice;
	private Float totalPricePaid;
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getNursery() {
		return nursery;
	}
	public void setNursery(String nursery) {
		this.nursery = nursery;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Float getTotalPricePaid() {
		return totalPricePaid;
	}
	public void setTotalPricePaid(Float totalPricePaid) {
		this.totalPricePaid = totalPricePaid;
	}
	
	
	
}