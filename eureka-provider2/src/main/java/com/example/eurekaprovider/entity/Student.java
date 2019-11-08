package com.example.eurekaprovider.entity;

public class Student {
        private Integer xh;
        private String name;
        private String sex;
        private Integer age;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Integer xh, String name, String sex, Integer age) {
        this.xh = xh;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }
}
