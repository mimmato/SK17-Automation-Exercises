package lesson8;

import java.util.HashSet;

public class l8_e6_removeDuplicates {
    public static void main(String[] args) {

        System.out.println("These are the unique items from our array: ");
        removeDuplicates();

    }

    static int[] numbers = {1, 2, 3, 1, 2, 3, 3, 4, 5, 1};

    private static void removeDuplicates() {

        HashSet<Integer> uniqueList = new HashSet<>();

        for (int number : numbers){
            uniqueList.add(number);
        }
        System.out.println(uniqueList);
    }
}
