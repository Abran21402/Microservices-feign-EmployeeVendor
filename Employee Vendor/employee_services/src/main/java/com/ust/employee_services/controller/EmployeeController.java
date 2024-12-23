package com.ust.employee_services.controller;

import com.ust.employee_services.entity.Employeeinfo;
import com.ust.employee_services.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemployee")
    public Employeeinfo addEmployee(@RequestBody Employeeinfo employee) {
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/getEmployee/{id}")
    public Employeeinfo getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("vendor/{vendorid}")
    public ResponseEntity<List<Employeeinfo>> getAccountByBankId(@PathVariable("vendorid") int vendorId){
        return ResponseEntity.ok(EmployeeService.getEmployeeinfoByVendorInfoId(vendorId));
    }}