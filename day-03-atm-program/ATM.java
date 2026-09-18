package org.example;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double startBalance = 500; //make all the amount the same dataType.

        System.out.println("=== Starlet Bank ===");

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();

            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3  Withdraw");
            System.out.println("4. Exit");

        System.out.println("Choose option: ");
        int option = input.nextInt(); // must be int not String

        if (option == 1){
            System.out.println("Hi " + name + ", your current Balance is: " + startBalance);
        }
        else if (option == 2) {
            System.out.println("How much would you like to deposit: ");
            double amount = input.nextInt();
            double Addedamount = startBalance + amount;

            System.out.println("Hi " + name + " your new balance is R" + Addedamount );

        } else if (option == 3) {
            System.out.println("How much do you want to withdraw? ");
            double withdraw = input.nextInt();

            if (withdraw > startBalance) {
                System.out.println("Insufficient Funds");
            }  else {
                double withdrawAmount = startBalance - withdraw; //First Validate then calculate
                System.out.println("Hi " + name + " your new balance is R" + withdrawAmount);
            }

        }
        else if (option == 4){
            System.out.println("Goodbye " + name + ", Thank you for using Startlet Bank!" );
        } else {
            System.out.println("Invalid Option");
        }
        input.close();


    }



    }

