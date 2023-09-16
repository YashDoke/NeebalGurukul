package com.service;

import com.exception.InvalidCategory;
import com.model.Product;

public class ProductService {
    
    public Product increasePriceByCategory(Product product)  {
        double increment = 0.0;
        String category = product.getCategory().toLowerCase();
        
        if (category.equalsIgnoreCase("mobiles")) {
            increment = 0.02 * product.getPrice();
        } else if (category.equalsIgnoreCase("laptops")) {
            increment = 0.01 * product.getPrice();
        } 
        
        product.setPrice(product.getPrice() + increment);
        return product;
    }

    public double computeTotalPrice(Product[] products) {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    
//    public String computeGreaterPrice(Product product1, Product product2) {
//        if (product1.getPrice() > product2.getPrice()) {
//            return product1.getTitle();
//        } 
//        if (product2.getPrice() > product1.getPrice()) {
//        	return product1.getTitle();
//        }
//        else
//        	return "Both Equal";
//		
//    }

    public  double computeGreaterPrice(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
        	return product1.getPrice();
        } else if (product2.getPrice() > product1.getPrice()) {
        	return product2.getPrice();
        } 
        
        	return product1.getPrice();
        
    }
}
