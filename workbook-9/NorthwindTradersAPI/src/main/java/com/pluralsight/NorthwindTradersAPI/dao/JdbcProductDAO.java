package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDAO implements ProductDAO {
    private DataSource dataSource;

    @Autowired
    public JdbcProductDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try(Connection conn = dataSource.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()) {
                Product product = new Product();
                product.setProductId(rows.getInt("productId"));
                product.setProductName(rows.getString("productName"));
                product.setCategoryId(rows.getInt("categoryId"));
                product.setUnitPrice(rows.getDouble("unitPrice"));
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public Product getById(int id) {
        Product product = null;
        String sql = "SELECT ProductID, ProductName, CategoryID, UnitPrice FROM products WHERE" +
        " ProductID =?";

        try(Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try(ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    int productId = rs.getInt("ProductID");
                    String productName = rs.getString("ProductName");
                    int categoryId = rs.getInt("CategoryID");
                    double unitPrice = rs.getDouble("UnitPrice");
                    product = new Product(productId, productName, categoryId, unitPrice);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
