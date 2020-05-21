package com.test;

public class Main {

    public static void main(String[] args) {
	// write your code
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("java");
        stu.setNumber(32);
        stu.message();
        stu.print();
        System.out.println(stu.i);
    }
}
