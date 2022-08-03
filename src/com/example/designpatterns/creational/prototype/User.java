package com.example.designpatterns.creational.prototype;

public class User implements Prototype{

    private String name;
    private String email;
    private int salary;

    public User(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new User(name, email, salary);
    }
}
