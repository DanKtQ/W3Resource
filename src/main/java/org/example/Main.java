package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        /*Person class
        // Create an instance of the Person class with the name "Loki" and age 35
        Person person1 = new Person("Loki", 35);
        // Create another instance of the Person class with the name "Freya" and age 27
        Person person2 = new Person("Freya", 27);

        // Print the name and age of person1 to the console
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        // Print the name and age of person2 to the console
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n"); */

/* Dog Class
        Dog dog1 = new Dog("Herra", "husky");
        Dog dog2 = new Dog("Bruno", "wolf");
        dog1.setDogName("Loki");
        dog2.setDogBreed("beagle");
        System.out.println("Set new Name and breed:");
        System.out.println(dog1.getDogBreed() + " is now " + dog1.getDogName());
        System.out.println(dog2.getDogName() + " is now " + dog2.getDogBreed()); */

/* Rectangle Class
        Rectangle rectangle1 = new Rectangle(10, 50);
        System.out.println("The Area of the rectangle is " + rectangle1.getArea());
        System.out.println("The Perimeter of the rectangle is " + rectangle1.getPerimeter()); */

/* Circle Class
        Circle circle1 = new Circle(7.55f);

        System.out.println("The Area of the circle is " + circle1.getArea());
        System.out.println("The Circumference of the circle is " + circle1.getCircumference());
        System.out.println("Now lets set a new radius: ");

        circle1.setRadius(7.77f);
        System.out.println("The Area of the circle with the " + circle1.getRadius() + " radius is: " + circle1.getArea());
        System.out.println("The Circumference of the circle with the " + circle1.getRadius() + " radius is: " + circle1.getCircumference()); */

/* Book class
        Book book1 = new Book("Marele Gatsby", "F. Scott Fitzgerald", "978-973-46-3295-4");
        Book book2 = new Book("Dulcele Bar", "J.R. Moehringer", "978-606-8360-48-5");

        Book.add_Book(book1);
        Book.add_Book(book2);

        ArrayList<Book> bookCollection = Book.get_BookCollection();
        System.out.println("My book collection includes: ");

        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        } */

/* Employee class
        Employee Fane = new Employee("Stefan", "Quality Assurance Analyst", 1740.5);
        Employee Magda = new Employee("Magdalena", "Developer", 1650.2);

        System.out.println("Salariul lui Fane este: " + Fane.getSalary());
        System.out.println("Salariul Magdei este: " + Magda.getSalary());

        Fane.updateSalary(2000.0, 10.0);
        System.out.println("Salariul lui Fane dupa o marire de 10% este: " + Fane.getSalary()); */

/* Bank class
        Bank bank = new Bank();

        Account account1 = new Account("Fiona", "D2244", 33000);
        Account account2 = new Account("Katya", "F3377", 1000);
        Account account3 = new Account("Freya", "P9955", 700);

        bank.add_Account(account1);
        bank.add_Account(account2);
        bank.add_Account(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.add_Money(account1, 1000);
        System.out.println(account1.getAccountInfo()); */

// TrafficLight class
        TrafficLight trafficLightObject = new TrafficLight("red", 50);

        // Print whether the traffic light is red
        System.out.println("The light is red: " + trafficLightObject.isRed());

        // Print whether the traffic light is green
        System.out.println("The light is green: " + trafficLightObject.isGreen());

        System.out.println("Traffic light shows the following: " + trafficLightObject.getColor() + " color and " + trafficLightObject.getDuration() + " seconds duration.");

        trafficLightObject.setColor("green");
        trafficLightObject.setDuration(30);

        System.out.println("After setting new values, the traffic light shows the following: " + trafficLightObject.getColor() + " color and " + trafficLightObject.getDuration() + " seconds duration.");

    }
}