package com.test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.model.Product;
import com.service.ProductService;

public class ProductServiceTest {
	ProductService productService = new ProductService();
	
     Product p1 = new Product(1, "Mobile Phone", 500.0, "Mobiles");
     Product p2 = new Product(2, "Laptop", 1000.0, "Laptops");
    
     Product parray[]= {p1,p2}; 

     @Test
     public void productData() {
    	 
    	 Assert.assertEquals(Math.round(510.0),Math.round(productService.increasePriceByCategory(p1).getPrice()));
    	 Assert.assertEquals(Math.round(1010.0),Math.round(productService.increasePriceByCategory(p2).getPrice()));
    	 
    	 Assert.assertEquals(Math.round(1520), Math.round(productService.computeTotalPrice(parray)));
    	 
    	 
    	 Assert.assertEquals(Math.round(1010.0),Math.round(productService.computeGreaterPrice(p1, p2)));
//       	 Assert.assertEquals(Math.round(510.0),Math.round(productService.computeGreaterPrice(p1, p2)));
     }
    
}
