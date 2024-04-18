package Javaprogram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is :"+fact);
    }

}
