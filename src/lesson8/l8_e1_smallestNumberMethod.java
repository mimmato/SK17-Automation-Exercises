package lesson8;

public class l8_e1_smallestNumberMethod {
    public static void main(String[] args) {
        System.out.println("The smallest number is: ");
        smallestNumber();
    }

    private static void smallestNumber() {

        int[] numbers = {55, 20, 100};
        int smallestNumber = numbers[0];

        for (int i : numbers) {
            if (smallestNumber > i) {
                smallestNumber = i;
            }
        }
        System.out.println(smallestNumber);
    }
}

