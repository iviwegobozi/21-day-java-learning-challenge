package org.example;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String name = "Sam";
        int mark1 = 30;
        int mark2 = 45;
        int mark3 = 40;
        int SET = 3;
        int sum = mark1 + mark2 + mark3;
        double average = (double)sum / (double)3.0F;
        System.out.println(name + "'s average is " + average);
    }
}
