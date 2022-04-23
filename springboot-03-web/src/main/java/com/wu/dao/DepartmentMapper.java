package com.wu.dao;

import com.wu.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
// 这个注解表示了这是一个 mybatis 的 mapper 类
@Mapper
@Repository
public interface DepartmentMapper {
    // 获取所有部门信息
    List<Department> getDepartments();

    // 通过id获得部门
    Department getDepartment(Integer id);

}
