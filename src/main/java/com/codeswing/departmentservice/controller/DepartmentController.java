package com.codeswing.departmentservice.controller;

import com.codeswing.departmentservice.entity.Department;
import com.codeswing.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department save(@RequestBody Department department){
        return departmentService.savedepartment(department);
    }

    @GetMapping("/getbyid/{departmentId}")
    public Optional<Department> getDepartment(@PathVariable("departmentId") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }
}
