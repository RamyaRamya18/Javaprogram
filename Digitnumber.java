package Javaprogram;

import java.util.Scanner;

public class Digitnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range value of 0-999: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9) {
            System.out.println("The number is a 1 digit number.");
        } else if (number >= 10 && number <= 99) {
            System.out.println("The number is a 2 digit number.");
        } else if (number >= 100 && number <= 999) {
            System.out.println("The number is a 3 digit number.");
        } else {
            System.out.println("Number out of range.");
        }
    }
}
