package Javaprogram;

import java.util.*;
public class ReverseArray {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println("Original List: " + list);
            Collections.reverse(list);
            System.out.println("Reversed List: " + list);
        }
}
