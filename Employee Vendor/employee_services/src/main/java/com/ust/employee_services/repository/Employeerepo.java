package com.ust.employee_services.repository;

import com.ust.employee_services.entity.Employeeinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Employeerepo extends JpaRepository<Employeeinfo,Integer> {
    List<Employeeinfo> findByVendorId(int vendorId);
}