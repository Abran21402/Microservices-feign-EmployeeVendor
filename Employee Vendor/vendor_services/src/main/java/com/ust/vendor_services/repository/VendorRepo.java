package com.ust.vendor_services.repository;


import com.ust.vendor_services.entity.VendorInfo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface VendorRepo extends JpaRepository<VendorInfo,Integer> {

}