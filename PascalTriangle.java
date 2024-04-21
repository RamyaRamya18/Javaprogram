package Javaprogram;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n- i - 1; j++) {
                        System.out.print("   ");
                    }


                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%6d", number(i, j));
                    }

                    System.out.println();
                }
            }

            public static int number(int n, int k) {
                if (k == 0 || k == n) {
                    return 1;
                } else {

                    return number(n - 1, k - 1) + number(n - 1, k);
                }




    }
}