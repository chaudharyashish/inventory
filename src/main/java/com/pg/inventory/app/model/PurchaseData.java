package com.pg.inventory.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_data")
public class PurchaseData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6261041155460971741L;
	private Long id;
	private Product product;
	private Nursery nursery;
	private Integer quantity;
	private Float totalPrice;
	private Float totalPricePaid;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@OneToOne
	public Nursery getNursery() {
		return nursery;
	}
	public void setNursery(Nursery nursery) {
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

	@Override
	public String toString() {
		return "PurchaseData [id=" + id + ", product=" + product + ", nursery=" + nursery + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", totalPricePaid=" + totalPricePaid + "]";
	}
	
}