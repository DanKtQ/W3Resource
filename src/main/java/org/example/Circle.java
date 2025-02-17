package org.example;
//Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.
//area = π𝒓²
//circumference = 2πr

public class Circle {
    // Declare a private variable to store the radius of the circle
    private float radius;

    //Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    //method to retrieve the radius of the circle
    public float getRadius(){
        return radius;
    }

    //method to set the radius of the circle
    public void setRadius(float circleRadius){
        this.radius = circleRadius;
    }

    //method to set the area of the circle
    public float getArea(){
        return (float) (radius*radius*Math.PI);
    }

    //method to set the circumference of the circle
    public float getCircumference(){
        return (float) (2*Math.PI*radius);
    }
}