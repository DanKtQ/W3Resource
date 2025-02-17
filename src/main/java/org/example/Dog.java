package org.example;

public class Dog {

    private String name, breed;

    public Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
    }

    public String getDogName() {
        return name;
    }

    public String getDogBreed() {
        return breed;
    }

    public void setDogName(String doggoName) {
        this.name = doggoName;
    }

    public void setDogBreed(String doggoBreed) {
        this.breed = doggoBreed;
    }
}

