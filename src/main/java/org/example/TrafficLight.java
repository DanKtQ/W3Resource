package org.example;

public class TrafficLight {
    // Declare private variables to store title, author and ISBN
    private String color;
    private int duration;

    //Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    //method to set the color of the trafficlight
    public void setColor(String trafficLightColor){
        this.color = trafficLightColor;
    }

    // Method to check if the traffic light is red
    public boolean isRed(){
        // Return true if the color is red, otherwise return false
        return color.equals("red");
    }

    // Method to check if the traffic light is red
    public boolean isGreen(){
        return color.equals("green");
    }

    //method to retrieve the color of the trafficlight
    public String getColor(){
        return color;
    }

    //method to retrieve the duration of the trafficlight
    public int getDuration(){
        return duration;
    }

    //method to set the duration of the trafficlight
    public void setDuration(int trafficLightDuration){
        this.duration = trafficLightDuration;
    }
}
