package com.springapp.dao;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.springapp.model.Product;
import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper{

    public Object MapRow(ResultSet rs, int rowNum) throws SQLException{
        Product product = new Product   (
                                            rs.getInt('id'),
                                            rs.getInt('tid'),
                                            rs.getString('code'),
                                            rs.getString('name'),
                                            rs.getString('description'),
                                            rs.getBigDecimal('price'),
                                            rs.getString('imageUrl')
                                        );
        return product;
    }


}