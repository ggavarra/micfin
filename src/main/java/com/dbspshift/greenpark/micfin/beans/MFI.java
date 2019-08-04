package com.dbspshift.greenpark.micfin.beans;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by gayathrig on 24/07/2019.
 */

@Document (value = "MFI")
public class MFI {

    @Id
    private String id;
    private String nationalSecurityNumber;
    private String name;
    private String fullName;
    private Address address;

    public MFI() {
    }

    public MFI(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNationalSecurityNumber() {
        return nationalSecurityNumber;
    }

    public void setNationalSecurityNumber(String nationalSecurityNumber) {
        this.nationalSecurityNumber = nationalSecurityNumber;
    }

    @Override
    public String toString() {
        return "MFI{" +
                "id='" + id + '\'' +
                ", nationalSecurityNumber='" + nationalSecurityNumber + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                '}';
    }
}
