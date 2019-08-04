package com.dbspshift.greenpark.micfin.beans;

import org.springframework.data.annotation.Id;

public class MicroEnterpreneur {
    @Id
    private String id;
    private String nationalSecurityNumber;
    private String name;
    private String fullName;
    private Address address;
}
