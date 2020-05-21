package com.test;

/**
 * @description: Student
 * @date: 2020/5/21 22:09
 * @author: 谢庆祝
 */
public class Student extends Person {
    int i = 2;
    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    //在子类中能直接使用父类的非私有成员变量
    public void message() {
        System.out.println("My name is " + this.name + ",I am " + this.age + " years old," + " my number is " + this.number);
    }

    public void print() {
        System.out.println(name);
        System.out.println(super.i);       //在子类中，要调用父类的成员，使用关键字super
    }
}
