package Lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {

    private String name;
    private String post;
    private String email;
    private long number;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, long number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = Math.abs(salary);
        this.age = Math.abs(age);
    }

    public Employee() {}

    void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(" Сотрудник: %s\n Должность: %s\n Email: %s\n Телефон: %d\n Зарплата: %d\n Возраст: %d\n", name, post, email, number, salary, age);
    }

    public int getAge() {
        return age;
    }
}
