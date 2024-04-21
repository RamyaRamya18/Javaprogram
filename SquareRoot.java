package Javaprogram;

import java.util.Scanner;
public class SquareRoot {
    public static void main(String[]args){
        float a ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = scanner.nextFloat();
        double result = Math.sqrt(a);
        System.out.println("print the square root value :"+ result);
    }
}
