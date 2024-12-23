package com.ust.vendor_services.config;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public FullResponse() {
    }

    public String vendorName;
    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String operationalHours;
    public String[] supportedRegions;
    List<Employeeinfo> employee_info;

    public FullResponse(String contactNumber, String email, List<Employeeinfo> employee_info, String operationalHours, String[] supportedRegions, String vendorAddress, String vendorName) {
        this.contactNumber = contactNumber;
        this.email = email;
        this.employee_info = employee_info;
        this.operationalHours = operationalHours;
        this.supportedRegions = supportedRegions;
        this.vendorAddress = vendorAddress;
        this.vendorName = vendorName;
    }




    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Employeeinfo> getEmployee_info() {
        return employee_info;
    }

    public void setEmployee_info(List<Employeeinfo> employee_info) {
        this.employee_info = employee_info;
    }



    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


}