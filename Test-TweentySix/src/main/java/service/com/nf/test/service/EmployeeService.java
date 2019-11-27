package service.com.nf.test.service;

import entity.com.nf.test.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum, int pageSize);

    void insert(EmployeeEntity employeeEntity);
}
