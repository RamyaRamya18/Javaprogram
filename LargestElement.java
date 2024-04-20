package Javaprogram;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {90,4,6,3,499,89};
        int num = 0;
        for(int i = 0; i< arr.length ; i++){
            if(arr[i]>num){
               num = arr[i];
            }
        }
        System.out.println("Largest element is :"+num);
    }
}
