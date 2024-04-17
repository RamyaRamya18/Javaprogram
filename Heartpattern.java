package Javaprogram;

public class Heartpattern {
        public static void main(String[]args){
            for(int i=1;i<=3;i++){
                for(int j=4;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                for(int p=1;p<i;p++){
                    System.out.print("*");
                }
                for(int l=3;l>=i;l--){
                    System.out.print(" ");
                }
                for(int n=2;n>=i;n--){
                    System.out.print(" ");
                }
                for(int m=1;m<=i;m++){
                    System.out.print("*");
                }
                for(int q=1;q<i;q++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<=1;i++){
                for(int q=1;q<=i;q++){
                    System.out.print(" ");
                }
                for(int j=13;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<=8;i++){
                for(int q=1;q<i;q++){
                    System.out.print(" ");
                }
                for(int j=8;j>=i;j--){
                    System.out.print("*");
                }
                for(int k=7;k>=i;k--){
                    System.out.print("*");
                }
                for(int q=1;q<=i;q++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
}
