package Javaprogram;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = { 90,45,3,5,6};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is :"+sum);
    }
}
