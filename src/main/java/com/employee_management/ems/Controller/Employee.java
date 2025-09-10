package com.employee_management.ems.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Employee {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "Welcome to Employee Management System";
    }
}
