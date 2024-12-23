package com.ust.vendor_services.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendor_info")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class VendorInfo {
    @Id
    public int id;
    public String vendorName;
    public String vendorAddress;

    public VendorInfo() {

    }

    public String contactNumber;
    public String email;
    public String serviceType;
    public String operationalHours;
    public double deliveryCharge;

    public VendorInfo(String contactNumber, double deliveryCharge, String email, int id, String operationalHours, String serviceType, String[] supportedRegions, String vendorAddress, String vendorName) {
        this.contactNumber = contactNumber;
        this.deliveryCharge = deliveryCharge;
        this.email = email;
        this.id = id;
        this.operationalHours = operationalHours;
        this.serviceType = serviceType;
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

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

    public String[] supportedRegions;


}