package Javaprogram;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a value :");
        int a = scanner.nextInt();
        System.out.println("Enter the b value :");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("print the c value :"+c);

    }
}
