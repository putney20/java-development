package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCategoryDAO implements CategoryDAO{
    private DataSource dataSource;

    @Autowired
    public JdbcCategoryDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();

        String sql = "SELECT CategoryID, CategoryName FROM Categories";

        try(Connection conn = dataSource.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()) {
                Category category = new Category();
                category.setCategoryId(rows.getInt("categoryId"));
                category.setCategoryName(rows.getString("categoryName"));
                categories.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }

    @Override
    public Category getById(int id) {
        Category category = null;
        String sql = "SELECT CategoryID, CategoryName FROM categories WHERE" +
                " CategoryID =?";

        try(Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try(ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    int categoryId = rs.getInt("CategoryID");
                    String categoryName = rs.getString("CategoryName");
                    category = new Category(categoryId, categoryName);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return category;
    }
}
