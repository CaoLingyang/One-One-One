package com.nf.service;

import com.nf.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum,int pageSize);
    void insert(EmployeeEntity employeeEntity);
}
