package org.example;


import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
       scanner = new Scanner(System.in);
       System.out.println("Hi, enter your name ");

       String name = scanner.nextLine();
       System.out.println("Enter your surname");
       String password = scanner.nextLine();
       Login login = new Login();
       Boolean userexist = login.checkUser(name,password);
       Train train = new Train(123, "Express Train");
       if(userexist){
           System.out.println("Welcome," + name );
           Reservation reservation = new Reservation();
           reservation.displayForm(train);
       }else{
           System.out.println("Try again");
       }

        
    }
}



