package org.example;

import org.example.model.DateFormatter;
import org.example.model.Department;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = "org.example.model")
@PropertySource("employee.properties")
public class Config {

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public Employee employee(){
        return new Employee(department());
    }

    @Bean
    public Department department(){
        return new Department();
    }

    @Bean
    public DateFormatter createdOn(){
       return new DateFormatter();
    }

}
