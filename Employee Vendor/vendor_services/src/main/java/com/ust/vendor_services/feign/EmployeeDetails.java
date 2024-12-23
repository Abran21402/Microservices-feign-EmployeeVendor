package com.ust.vendor_services.feign;

import com.ust.vendor_services.config.Employeeinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="Employee-Services",url="http://localhost:9097/employee")
public interface EmployeeDetails {
    @GetMapping("/vendor/{vendorid}")
    List<Employeeinfo> findAllEmployeeinfoByVendorInfo(@PathVariable("vendorid") int id);
}