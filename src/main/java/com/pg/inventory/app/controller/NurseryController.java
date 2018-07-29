package com.pg.inventory.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pg.inventory.app.model.Product;
import com.pg.inventory.app.model.PurchaseData;
import com.pg.inventory.app.model.PurchasingData;
import com.pg.inventory.app.repository.NurseryRepository;
import com.pg.inventory.app.repository.ProductRepository;
import com.pg.inventory.app.repository.PurchaseDataRepository;

@Controller
public class NurseryController {
   
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private NurseryRepository nurseryRepository;
	
	@Autowired
	private PurchaseDataRepository purchaseDataRepository;
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public ModelAndView homePage() {
    	ModelAndView modelAndView = new ModelAndView("homepage");
    	modelAndView.addObject("purchaseData", new PurchasingData());
    	modelAndView.addObject("products", new ArrayList<>());
    	modelAndView.addObject("status", false);
    	return modelAndView;
    }
	
    @RequestMapping(value = "/getNursery/{name}", method = RequestMethod.GET)
    public ModelAndView getAvailableNurseries(@PathVariable(value="name") String productName) {
    	List<Product> products = productRepository.findByProductNameContaining(productName);
    	
    	ModelAndView modelAndView = new ModelAndView("homepage");
    	modelAndView.addObject("purchaseData", new PurchasingData());
    	modelAndView.addObject("products", products);
    	modelAndView.addObject("status", false);
    	return modelAndView;
    }

    @RequestMapping(value = "/purchase", method = RequestMethod.POST)
    public ModelAndView purchase(@ModelAttribute PurchasingData purchasingData) {
    	ModelAndView modelAndView = new ModelAndView("homepage");
    	
    	PurchaseData purchaseData = new PurchaseData();
    	purchaseData.setProduct(productRepository.findOne(Long.valueOf(purchasingData.getProduct())));
    	purchaseData.setNursery(nurseryRepository.findOne(Long.valueOf(purchasingData.getNursery())));
    	purchaseData.setQuantity(purchasingData.getQuantity());
    	purchaseData.setTotalPrice(purchasingData.getTotalPrice());
    	purchaseData.setTotalPricePaid(purchasingData.getTotalPricePaid());
    	PurchaseData savedData = purchaseDataRepository.save(purchaseData);
    	
    	if(null != savedData.getId()) {
    		modelAndView.addObject("status", true);
    	}
    	else {
    		modelAndView.addObject("status", false);
    	}
    		
    	modelAndView.addObject("purchaseData", new PurchasingData());
    	modelAndView.addObject("products", new ArrayList<>());
    	return modelAndView;
    }

}
