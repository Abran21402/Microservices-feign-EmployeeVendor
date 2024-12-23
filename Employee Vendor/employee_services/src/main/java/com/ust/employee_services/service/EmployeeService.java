package com.ust.employee_services.service;

import com.ust.employee_services.entity.Employeeinfo;
import com.ust.employee_services.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public static Employeerepo repo;

    public Employeeinfo getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employeeinfo addEmployee(Employeeinfo Employee) {
        return repo.save(Employee);
    }

    public static List<Employeeinfo> getEmployeeinfoByVendorInfoId(int vendorId) {
        return repo.findByVendorId(vendorId);
    }
}