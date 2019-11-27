package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert() {
        String sql="insert into employee(username)values('1234asdfghjkl')";
        jdbcTemplate.update(sql);
    }
}
