package com.config.simple;

import com.alibaba.druid.pool.DruidDataSource;
import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

@ComponentScan("com")
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement

public class SimpleConfig {
    @Bean
    public EmployeeDao employeeDao(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public DataSource dataSource(){

        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/store?useSSL=true");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;

    }
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }




}
