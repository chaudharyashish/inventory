package com.pg.inventory.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pg.inventory.app.model.Nursery;
import com.pg.inventory.app.model.Product;

@Service
public class NurseryServiceImpl implements NurseryService {

	@Override
	public List<Nursery> findByProduct(Product product) {
		return null;
	}
}