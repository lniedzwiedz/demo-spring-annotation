package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.demo")
public class AppConfig {
   @Bean
   public IEmployee getEmployee() {
      return new Employee();
   }

   @Bean
   public String getName() {
      return "AGH";
   }

   @Bean
   public Person getNameP() {
      return new Person("Mikołaj", "święty");
   }

   @Bean
   public Partner getNamePartner() {
//      return new Partner();
      Partner p = new Partner();
      p.setParName("Julia");
      return p;
   }




}