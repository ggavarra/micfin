package com.dbsPShift.greenpark.micfin.beans;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by gayathrig on 24/07/2019.
 */

@Document
public class MFI {

    @Id
    private String id;
    private String name;
    private String fullName;

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
}
