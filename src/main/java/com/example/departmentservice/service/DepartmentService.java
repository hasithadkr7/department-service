package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    Department findDepartmentById(Long departmentId);

    List<Department> getAllDepartment();
}
