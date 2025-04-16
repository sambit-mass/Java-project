package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RootController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/")
    public List<Employee> home() {
        return repository.findAll();
    }
}
