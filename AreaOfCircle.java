package Javaprogram;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :");
        int r = scanner.nextInt();
        double pi = 3.14;
        double a = pi*r*r;
        System.out.println("print the area of circle : "+ a);
    }
}
