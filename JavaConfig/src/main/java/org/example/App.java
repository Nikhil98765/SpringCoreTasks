package org.example;


import org.example.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App
{
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Employee employee = context.getBean("employee", Employee.class);

        employee.displayInfo();

        context.close();
    }

}
