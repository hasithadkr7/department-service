package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentServiceImpl");
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentServiceImpl");
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
}
