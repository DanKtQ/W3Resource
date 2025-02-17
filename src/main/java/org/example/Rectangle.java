package org.example;

public class Rectangle {
    // Declare private variables to store width and height;
    private int width, height;

    // Constructor for the Rectangle class that initializes the width and height variables
    public Rectangle(int rectangleWidth, int rectangleHeight) {
        this.width = rectangleWidth;
        this.height = rectangleHeight;
    }

    // Method to retrieve the width of the rectangle
    public int getWidth() {
        return width;
    }

    // Method to retrieve the height of the rectangle
    public int getHeight() {
        return height;
    }

    // Method to retrieve the area of the rectangle
    public int getArea(){
        return width * height;
    }

    // Method to retrieve the perimeter of the rectangle
    public int getPerimeter() {
        return 2*(width + height);
    }
}
