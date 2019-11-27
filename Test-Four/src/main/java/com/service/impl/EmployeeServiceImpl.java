package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//表明这个类是支持事务
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DeptDao deptDao;

    public EmployeeServiceImpl(DeptDao deptDao,EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao=employeeDao;
    }
    @Transactional
    public void demo(){
        employeeDao.delete();
        deptDao.insert();
    }
}
