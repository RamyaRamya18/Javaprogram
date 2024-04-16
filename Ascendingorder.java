package Javaprogram;

public class Ascendingorder {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {10,50, 40, 30, 20 ,70,60,90,80};
        int temp = 0;

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { if(arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
        }


        //Displaying elements of array after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
