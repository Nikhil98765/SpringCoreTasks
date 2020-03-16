package org.example.model;

import java.util.List;

public class Employee {

    private String name;
    private Integer age;
    private Double salary;
    private List<String> taskList;

    private Department department;

    public void init(){
        System.out.println("init method was executed");
    }

    public Employee(String name, Integer age, Double salary, Department department, List<String> taskList) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.taskList = taskList;
    }

    public void displayInfo(){

        System.out.println("name : "+name +", age : "+age+", salary : "+salary+" , "+department);
        System.out.println("task list :");
        for(String item: taskList){
            System.out.println(item + " ");
        }
    }

    public void destroy(){
        System.out.println("destroy method was executed");
    }
}
