package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public DeptServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }

    @Transactional(readOnly =false)
    public void txDemp(){
        deptDao.delete();
        employeeDao.insert();
    }
}

