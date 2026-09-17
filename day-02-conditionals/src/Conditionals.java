package org.example;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {


        Scanner input =  new Scanner(System.in);

        System.out.println("=== Student Mark Registration ===");

        System.out.println("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.println("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.println("Enter Assignment 1 mark: ");
        double mark1 = input.nextDouble(); //Look at dataType double is not equal to nextInt().

        System.out.println("Enter Assignment 2 mark:  ");
        double mark2 = input.nextDouble(); //Look at dataType double is not equal to nextInt().

        System.out.println("Enter Exam mark:  ");
        double mark3 = input.nextDouble(); //Look at dataType double is not equal to nextInt().

        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println(" ");

        double sum = mark1 + mark2 + mark3;
        final int MARKS = 3; //final needed for constant
        double average = sum / MARKS;

        //Start with strictest condition.
        if (average >= 75) {
            System.out.println("Status: Passed with Distinction!");
        }
        else if (average >= 50) {
            System.out.println("Status: Passed!");
        } else {
            System.out.println("Status: Failed");
        }













        /*
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name + " you are " + age + " year's old ");

        input.close();

         **/


    }
}
