package org.example;

import java.util.Scanner;
public class Reservation {

    private Scanner scanner;

    public Reservation() {
        this.scanner = new Scanner(System.in);
    }

    public void displayForm(Train train) {
        System.out.println("Reservation Form");
        System.out.println("Train Number: " + train.getTrainNumber());
        System.out.println("Train Name: " + train.getTrainName());

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter class type (e.g., First Class, Second Class): ");
        String classType = scanner.nextLine();

        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();

        System.out.print("Enter from (place): ");
        String from = scanner.nextLine();

        System.out.print("Enter destination: ");
        String to = scanner.nextLine();

        // Process the reservation (you can save it to a database or perform other actions)
        System.out.println("Reservation details:");
        System.out.println("Name: " + name);
        System.out.println("Class Type: " + classType);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }
}
