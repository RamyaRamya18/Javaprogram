package Javaprogram;

public class StringProgram {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1 + " " + str2;
        System.out.println("Combined string: " + combined);
        int length = combined.length();
        System.out.println("Length of the combined string: " + length);
        String sub = combined.substring(6);
        System.out.println("Substring from index 6: " + sub);
        boolean contains = combined.contains("World");
        System.out.println("Does it contain 'World'? " + contains);
        int index = combined.indexOf('o');
        System.out.println("Index of 'o' in the combined string: " + index);
        String upperCase = combined.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);
        String lowerCase = combined.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);
    }
}

