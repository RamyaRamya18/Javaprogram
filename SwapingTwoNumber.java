package Javaprogram;

import java.util.Scanner;

public class SwapingTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b =");
        int b = scanner.nextInt();
        int c = a;
        a = b;
        System.out.println("a ="+a);
        b = c;
        System.out.println("b ="+b);
    }
}
