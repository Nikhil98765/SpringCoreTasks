package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Department {


    @Value("${DepartmentName}")
    private String name;

    @Autowired
    private Date createdOn;


    @Override
    public String toString() {
        return "Department name : " + name + ", created on : "+ createdOn ;
    }

}