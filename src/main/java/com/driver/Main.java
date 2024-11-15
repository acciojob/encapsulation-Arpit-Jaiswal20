package com.driver;

public class Main {
 public  static void main (String []args){

    RWOnly rwonly = new RWOnly();

    //    rwonly.id = 100;
    //    System.out.println(rwonly.id);

    // java: id has private access in com.driver.RWOnly

        rwonly.setId(100);
        System.out.println(rwonly.getId());
 
}
