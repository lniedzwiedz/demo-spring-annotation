package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee implements IEmployee {

   private Person person;
   Partner partner;

   @Autowired
   public void setPerson(Person person) {
      this.person = person;
   }

   @Autowired
   public void setPartner(Partner partner) {
      this.partner = partner;
   }


   @Override
   public void showEmployeeInfo() {
      System.out.println("My name is "+ person.nameFirst + " " + person.lastName +", I am an Employee.");
      if(partner.parName == null){
         System.out.println("partner name is wolny");
      }
      else{
         System.out.println("partner name is "+ partner.parName);
      }
   }
}