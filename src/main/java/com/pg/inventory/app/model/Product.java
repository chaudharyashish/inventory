package com.pg.inventory.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 4867834018368999084L;
	private Long id;
    private String productName;
    private List<Nursery> nurseries;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@OneToMany(mappedBy = "product")
	public List<Nursery> getNurseries() {
		return nurseries;
	}

	public void setNurseries(List<Nursery> nurseries) {
		this.nurseries = nurseries;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", nurseries=" + nurseries + "]";
	}

	
}