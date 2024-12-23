package com.ust.vendor_services.service;

import com.ust.vendor_services.config.FullResponse;
import com.ust.vendor_services.config.Employeeinfo;
import com.ust.vendor_services.entity.VendorInfo;
import com.ust.vendor_services.feign.EmployeeDetails;
import com.ust.vendor_services.repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepo repo;
    @Autowired
    private EmployeeDetails details;

    public VendorInfo addVendor(VendorInfo vendor) {
        return repo.save(vendor);
    }

    public List<VendorInfo> getAllVendors() {
        return repo.findAll();
    }

    public VendorInfo findVendorById(int id) {
        return repo.findById(id).orElse(null);
    }

    public FullResponse getVendorById(int id) {
        VendorInfo vendor = repo.findById(id).orElse(null);
        List<Employeeinfo> p = details.findAllEmployeeinfoByVendorInfo(id);
        FullResponse fullResponse = new FullResponse();
        fullResponse.setVendorName(vendor.getVendorName());
        fullResponse.setVendorAddress(vendor.getVendorAddress());
        fullResponse.setContactNumber(vendor.getContactNumber());
        fullResponse.setEmail(vendor.getEmail());
        fullResponse.setOperationalHours(vendor.getOperationalHours());
        fullResponse.setSupportedRegions(vendor.getSupportedRegions());
        fullResponse.setEmployee_info(p);
        return fullResponse;
    }
}