package Javaprogram;


import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number is a+bi :");
        int real1 = scanner.nextInt();
        int img1 = scanner.nextInt();
        System.out.println("Enter the number is c+di:");
        int real2 = scanner.nextInt();
        int img2 = scanner.nextInt();
        int real = real1 + real2;
        int img = img1 + img2;
        System.out.println("Add the two complex number is a+bi and c+di:" + real +"+"+img + "i" );
    }
}
