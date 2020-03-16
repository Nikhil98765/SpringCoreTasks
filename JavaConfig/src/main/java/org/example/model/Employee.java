package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Employee {

    @Value("${EmployeeName}")
    private String name;

    @Value("${EmployeeAge}")
    private Integer age;

    @Value("${EmployeeSalary}")
    private Double salary;

    @Value("${taskList}")
    private List<String> taskList;


    @Autowired
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(Department department) {
        this.department = department;
    }

    public void init(){
        System.out.println("init is executed");
    }

    public void displayInfo(){

        System.out.println("name : "+name +", age : "+age+", salary : "+salary+" , "+department);
        System.out.println("task list :");
        for(String item: taskList){
            System.out.println(item + " ");
        }
    }

    public void destroy(){
        System.out.println("destroy is executed");
    }


}

