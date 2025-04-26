package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Partner {

    String parName;

    public void setParName(String parName) {
      this.parName = parName;
    }


    public String getParName() {
            return this.parName;
    }
}
