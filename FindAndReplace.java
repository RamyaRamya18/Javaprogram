package Javaprogram;

import java.util.Scanner;
public class FindAndReplace{
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
