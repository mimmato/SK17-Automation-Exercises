package lesson5;

public class l5_e2_divideBy5 {
    public static void main(String[] args) {
//        divideForEachNoBreak();
//        divideForEachBreak();
//        divideForNoBreak();
//        divideForBreak();
//        divideWhileNoBreak();
//        divideWhileBreak();
//        divideDoWhileNoBreak();
//        divideDoWhileBreak();

    }


    static int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

    // Instructions:
    // display only the numbers from the array which can be divided by 5
    // exit loop when a number greater than 150 is checked
    // use break; in this exercise

    // For Each solution without break;
    public static void divideForEachNoBreak() {
        for (int number : numbers) {
            if (number <= 150 && number % 5 == 0) {
                System.out.println("The current number divisible by 5 is: " + number);
            }
        }
    }

    // For Each solution with break;
    public static void divideForEachBreak() {
        for (int number : numbers) {
            if (number == 150) {
                System.out.println("The last number divisible by 5 as per the condition is: " + number);
                break;
            }
            if (number % 5 == 0) {
                System.out.println("Print if divided by 5: " + number);
            }
        }
    }

    // For solution/no break;
    public static void divideForNoBreak() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);

            }
        }
    }

    // For solution with break;
    private static void divideForBreak() {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 150) {
                System.out.println("The last number divisible by 5 as per the condition is: " + numbers[i]);
                break;
            }
            if (numbers[i] % 5 == 0) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
            }
        }
    }

    // While solution without break;
    private static void divideWhileNoBreak() {
        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
            }
            i++;
        }
    }

    // While solution with break;
    private static void divideWhileBreak() {

        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] % 5 == 0) {
                System.out.println("The following numbers are less than 150 and divisible by 5: " + numbers[i]);
            }
            if (numbers[i] == 150) {
                System.out.println("This is the last number divisible by 5: " + numbers[i]);
                break;
            }
            i++;
        }
    }

    // working do while loop
    private static void divideDoWhileNoBreak() {
        int i = 0;

        do {
            if (numbers[i] % 5 == 0 && numbers[i] <= 150) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
            }
            i++;
        }
        while (i < numbers.length);
    }

    // working do while loop with break;
    private static void divideDoWhileBreak() {
        int i = 0;
        do {
            if (numbers[i] % 5 == 0) {
                System.out.println("The following numbers from the list are divisible by 5 and are NOT greater than 150: " + numbers[i]);
            }
            if (numbers[i] == 150) {
                System.out.println(" ");
                break;
            }
            i++;
        }
        while (i < numbers.length);
    }
}









