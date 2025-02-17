package org.example;
//    Write a Java program to create a class called "org.example.Person" with a name and age attribute.
//    Create two instances of the "org.example.Person" class, set their attributes using the constructor, and print their name and age.

// Define the Person class
public class Person {
    // Declare a private variable to store the name of the person
    private String name;
    // Declare a private variable to store the age of the person
    private int age;

    // Constructor for the Person class that initializes the name and age variables
    public Person(String personName, int personAge) {
        // Set the name variable to the provided name parameter
        this.name = personName;
        // Set the age variable to the provided age parameter
        this.age = personAge;
    }

    // Method to retrieve the name of the person
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to retrieve the age of the person
    public int getAge() {
        // Return the value of the age variable
        return age;
    }
}
