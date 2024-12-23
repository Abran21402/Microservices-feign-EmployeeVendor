package com.ust.vendor_services.controller;

import com.ust.vendor_services.config.FullResponse;
import com.ust.vendor_services.entity.VendorInfo;
import com.ust.vendor_services.service.VendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private VendorService service;

    @PostMapping("/addvendor")
    public VendorInfo addVendor(@RequestBody VendorInfo vendor) {
        return service.addVendor(vendor);
    }
    @GetMapping("/findallvendors")
    public List<VendorInfo> getAllVendors() {
        return service.getAllVendors();
    }

    @GetMapping("/vendor/{vendorid}")
    public ResponseEntity<FullResponse> getVendorById(@PathVariable("vendorid") int id){
        return ResponseEntity.ok(service.getVendorById(id));
    }

    @GetMapping("/findvendorbyid/{id}")
    public VendorInfo findVendorById(@PathVariable int id) {
        return service.findVendorById(id);
    }
}