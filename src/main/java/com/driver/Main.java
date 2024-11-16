package com.driver;

public class Main {
 public  static void main (String []args){

    RWOnly rwonly = new RWOnly();

    //    rwonly.name = "Rahul";
    //    System.out.println(rwonly.name);
    // java: id has private access in com.driver.RWOnly

       rwonly.setName("Rahull");
       rwonly.getName();
 
}
