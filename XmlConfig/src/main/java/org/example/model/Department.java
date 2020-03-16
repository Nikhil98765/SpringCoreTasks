package org.example.model;

import java.util.Date;

public class Department {


    private String name;
    private Date createdOn;

    public Department(String name, Date createdOn) {
        this.name = name;
        this.createdOn = createdOn;
    }



    @Override
    public String toString() {
        return "Department name : " + name +" , createdOn : "+ createdOn.toString() ;
    }
}
