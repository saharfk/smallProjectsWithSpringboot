package com.jdbcproject.jdbc;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SomeComponent {
    public static final Logger logger = LoggerFactory.getLogger(SomeComponent.class);
    @Autowired
    HikariDataSource dataSource;

    @PostConstruct
    public void SomeComponent() throws SQLException {
        logger.info("Database connection valid = {}", dataSource.getConnection());
        String sql = "SELECT PK_RABBIT_SERVICE,FK_RABBIT_SET_ID FROM tbs_rabbit_service";
        Connection con = dataSource.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println(rs);
        while (rs.next()) {
            int coffeeName = rs.getInt("PK_RABBIT_SERVICE");
            int supplierID = rs.getInt("FK_RABBIT_SET_ID");

            System.out.println(coffeeName + ", " + supplierID);
        }
    }
}