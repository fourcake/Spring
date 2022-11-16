package com.atguigu.spring5.bean;

public class Emp {
    //员工类
    private String ename;
    private String gender;

    //员工属于某个部门，用对象的形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void testdemo(){
        System.out.println(ename+" "+gender+" "+dept+" ");
    }
    //生成get方法
    public Dept getDept() {
        return this.dept;
    }
}
