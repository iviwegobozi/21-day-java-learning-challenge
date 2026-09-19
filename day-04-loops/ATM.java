package org.example;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double startBalance =  500; //make all the amount the same dataType.

        System.out.println("=== Starlet Bank ===");

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();

        int option = 0; //declare my count

        while (option != 4) { // keep logic inside while loop

            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3  Withdraw");
            System.out.println("4. Exit");

            System.out.println("Choose option: ");
            option = input.nextInt(); // must be int not String



            if (option == 1){
                System.out.println("Hi " + name + ", your current Balance is: " + startBalance);
            }
            else if (option == 2) {
                System.out.println("How much would you like to deposit: ");
                double amount = input.nextDouble();
                startBalance += amount; //Variables are reassigned, not created. "+=" = add and reassign.

                System.out.println("Hi " + name + " your new balance is R" + startBalance );

            } else if (option == 3) {
                System.out.println("How much do you want to withdraw? ");
                double withdraw = input.nextDouble();

                if (withdraw > startBalance) {
                    System.out.println("Insufficient Funds");
                }  else {
                    startBalance -= withdraw; //First Validate then calculate
                    System.out.println("Hi " + name + " your new balance is R" + startBalance);
                }

            }
            else if (option == 4){
                System.out.println("Goodbye " + name + ", Thank you for using Startlet Bank!" );
            } else {
                System.out.println("Invalid Option");
            }

        }


        input.close();


    }



    }

