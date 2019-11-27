package service.com.nf.test.service.impl;

import dao.com.nf.test.dao.EmployeeDao;
import entity.com.nf.test.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.com.nf.test.service.EmployeeService;

import java.util.List;
@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    private EmployeeDao dao;
    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum, pageSize);
    }

    @Override
    public void insert(EmployeeEntity employeeEntity) {
        dao.insert(employeeEntity);
    }
}
