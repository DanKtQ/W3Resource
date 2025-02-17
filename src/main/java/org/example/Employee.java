package org.example;

public class Employee {
    // Declare private variables to store the name, job_title and salary of an employee
    private String name, job_title;
    private double salary;

    //Constructor
    public Employee(String name, String job_title, double salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    //method to retrieve the employee name
    public String getName(){
        return name;
    }

    public String getJob_title(){
        return job_title;
    }

    //method to get the salary of an employee
    public double getSalary(){
        return salary;
    }

    //method to set the salary of an employee
    public void setSalary(double employeeSalary){
        this.salary = employeeSalary;
    }

    //method to update the salary of an employee
    public void updateSalary(double currentSalary, double percentIncrease){
        this.salary = currentSalary + (percentIncrease/100)*currentSalary;
    }
}
