package com.atguigu.spring5;

public class Book {
    String bname;
    String bauthor;
    String address;
    public void setBname(String bname){
        this.bname=bname;
    }
    public void setBauthor(String bauthor){
        this.bauthor=bauthor;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public void testBook(){
        System.out.println(this.bname+" "+this.bauthor+":"+this.address);
    }
}