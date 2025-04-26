package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    String nameFirst;
    String lastName;
//    String parName;

    public Person(String nameFirst, String lastName) {
        this.nameFirst = nameFirst;
        this.lastName = lastName;
    }

//    void setParName(String parName){
//        this.parName = parName;
//    }




}
