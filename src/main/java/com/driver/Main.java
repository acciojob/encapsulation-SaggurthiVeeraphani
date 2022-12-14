package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.SetName("Veera Phani");
        System.out.println(obj.getName());
        //name has private access in com.driver.RWOnly
    }
  
}