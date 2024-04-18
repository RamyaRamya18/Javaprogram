package Javaprogram;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number :");
        int num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
    }

}
