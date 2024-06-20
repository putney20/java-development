package com.pluralsight.NorthwindTradersAPI.controller;


import com.pluralsight.NorthwindTradersAPI.dao.ProductDAO;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    //List<Product> products = new ArrayList<>();

    private ProductDAO dao;

    @Autowired
    public ProductsController(ProductDAO dao) {
        this.dao = dao;
    }

    //respond to http://localhost:8080/products
    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        List<Product> products = dao.getAll();
        return products;
    }
    /*@RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        products.add(new Product(1, "Product 1", 5, 10.78));
        products.add(new Product(2, "Product 2", 6, 10.09));
        products.add(new Product(3, "Product 3", 17, 10.92));
        return products;
    }*/

    //respond to http://localhost:8080/products/1
    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable int productId) {
        Product product = dao.getById(productId);
        return product;

    }

   /* @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable int productId)
    {
        for (Product product :products) {
            if (product.getProductId()==productId) {
                return product;
            }
        }
        return null;
    }*/

}
