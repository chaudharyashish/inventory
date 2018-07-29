package com.pg.inventory.app.service;

import java.util.List;

import com.pg.inventory.app.model.Nursery;
import com.pg.inventory.app.model.Product;

public interface NurseryService {

	List<Nursery> findByProduct(Product product);
}
