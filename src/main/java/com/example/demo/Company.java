package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

   private IEmployee employee;
   private String name;
   @Autowired
   public Company(IEmployee employee, String name) {
      this.employee = employee;
      this.name = name;
   }

   @Autowired
   public void setName(String name){
      this.name = name;
   }

   public void showEmployeeInfo() {
	   System.out.println(name+": We will ask our Employee to introduce himself.");
      employee.showEmployeeInfo();
   }
}