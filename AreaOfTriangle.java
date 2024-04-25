package Javaprogram;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the breath :");
        int b = scanner.nextInt();
        System.out.println("Enter the height :");
        int h = scanner.nextInt();
        double a = 0.5*b*h;
        System.out.println("print the area of triangle : "+ a);
    }
}
