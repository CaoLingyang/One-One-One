package service.com.nf.test.service.impl;

import dao.com.nf.test.dao.DeptDao;
import dao.com.nf.test.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.com.nf.test.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Transactional

    @Override
    public void deleteById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptDao.deleteById(deptid);
    }
}
