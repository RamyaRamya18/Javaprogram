package Javaprogram;

public class MultipleArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println("Multiple array elements:");
        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }
    }
}

