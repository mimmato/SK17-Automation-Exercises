package lesson5;

public class l5_e3_reverseList {
    public static void main(String[] args) {
        reverseForAssignmentOperators();

    }
    static int[] numbers = {10, 20, 30, 40, 50};

    // The following reverses the order of the elements being printed in reverseForAssignmentOperators();
    // logic to follow is:
    // 1. define the length of the array
    // 2. set negative indexing, so the program starts counting from the last value of the array
    // 3. Have the program stop when i is >= 0
    // 4. decrement by -1 after each iteration

    public static void reverseForAssignmentOperators() {

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Numbers in reverse using For loop: " + numbers[i]);
        }
    }
}




