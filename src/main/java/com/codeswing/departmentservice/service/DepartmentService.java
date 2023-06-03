package com.codeswing.departmentservice.service;

import com.codeswing.departmentservice.entity.Department;
import com.codeswing.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department savedepartment(Department department) {
    return departmentRepository.save(department);
    }

    public Optional<Department> getDepartmentById(Long departmentId) {
    return Optional.of(departmentRepository.findById(departmentId).orElse(new Department()));
    }
}
