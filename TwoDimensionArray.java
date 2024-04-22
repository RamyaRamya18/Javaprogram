package Javaprogram;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int [][]a = new int[3][3];
        int val = 1;
        for(int i =0;i<3 ; i++){
            for(int j= 0; j<3;j++){
                a[i][j] = val;
                val++;
            }
        }
        System.out.println("TwoDimensionArray");
        for(int i =0;i<3 ; i++){
            for(int j= 0; j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
