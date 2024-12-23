package com.ust.employee_services.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "employee")
public class Employeeinfo {
    public Employeeinfo() {
    }

    public Employeeinfo(String deliverytype, String employeeaddress, String employeeemail, String employeeid, String employeename, String employeenumber, String giftchoice, int id, int vendorId) {
        this.deliverytype = deliverytype;
        this.employeeaddress = employeeaddress;
        this.employeeemail = employeeemail;
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeenumber = employeenumber;
        this.giftchoice = giftchoice;
        this.id = id;
        this.vendorId = vendorId;
    }

    @Id
    public int id;
    public String employeeid;
    public String employeename;
    public String employeeemail;
    public String employeeaddress;
    public String employeenumber;
    public String deliverytype;
    public String giftchoice;
    public int vendorId;

    public String getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public String getEmployeeemail() {
        return employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        this.employeeemail = employeeemail;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getGiftchoice() {
        return giftchoice;
    }

    public void setGiftchoice(String giftchoice) {
        this.giftchoice = giftchoice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }


}