package Javaprogram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal value :");
        int P = scanner.nextInt();
        System.out.println("Enter the rate of interest value :");
        int R = scanner.nextInt();
        System.out.println("Enter the time duration value :");
        int T = scanner.nextInt();
        int SimpleInterest = P*R*T/100;
        System.out.println("print the SimpleInterest value :"+SimpleInterest );
    }
}
