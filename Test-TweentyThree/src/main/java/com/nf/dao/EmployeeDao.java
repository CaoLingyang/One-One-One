package com.nf.dao;

import com.nf.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<EmployeeEntity> getAll(@Param("pageNum")int pageNum, @Param("pageSize")int pageSize);

    void insert(EmployeeEntity employeeEntity);
}
