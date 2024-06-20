package com.pluralsight.dao;

import com.pluralsight.model.Product;

public interface ProductDAO {
    public void add(Product product);
    public void getAll();
}
