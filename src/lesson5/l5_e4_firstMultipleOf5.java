package lesson5;

public class l5_e4_firstMultipleOf5 {
    public static void main(String[] args) {

//        forEachLoop();
//        forLoop();
//        whileLoop();
        doWhileLoop();
    }

    static int[] arrayList = {17, 23, 10, 20, 30, 40, 50};

    // for each loop
    private static void forEachLoop() {

        for (int number : arrayList) {
            if (number % 5 == 0) {
                System.out.println("This number is the first multiple of 5: " + number);
                break;
            }
        }
    }

    // for loop
    private static void forLoop() {

        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] % 5 == 0) {
                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
                break;
            }
        }
    }

    // while loop
    private static void whileLoop() {

        int i = 0;

        while (i < arrayList.length) {
            if (arrayList[i] % 5 == 0) {
                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
                break;
            }
            i++;
        }
    }

        // do while
    private static void doWhileLoop() {

        int i = 0;

        do {
            if (arrayList[i] % 5 == 0) {
                System.out.println("This number is the first multiple of 5: " + arrayList[i]);
                break;
            }
            i++;
        } while (i < arrayList.length);
    }
}

