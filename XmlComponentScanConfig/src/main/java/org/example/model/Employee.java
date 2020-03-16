package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@PropertySource("employee.properties")
@Component
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

    public void displayInfo(){

        System.out.println("name : "+name +", age : "+age+", salary : "+salary+" , "+department);

        System.out.println("task list was : ");
        for(String task : taskList){
            System.out.println(task);
        }

    }
}
