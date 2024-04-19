package Javaprogram;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l < i; l++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static class FindAndReplace{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the original string :");
            String originalstring = scanner.nextLine();
            System.out.println("Enter the substring to find:");
            String findstring = scanner.nextLine();
            System.out.println("Enter the substring to replace with:");
            String replacestring = scanner.nextLine();
            String modifiedstring = originalstring.replace(findstring,replacestring);
            System.out.println("Modifiedstring:"+modifiedstring);
        }
    }
}
