package lesson5;

public class l5_e5_skipMultiples {
    public static void main(String[] args) {
//        forEachLoop();
//        forLoop();
//        whileLoop();
            doWhileLoop();
    }

    static int[] arrayList = {23, 55, 99, 3, 10, 9, 24, 18, 200};

    //for each loop
    private static void forEachLoop() {
        for (int i : arrayList) {
            if (!(i % 3 == 0)) {
                System.out.println("These numbers are NOT multiples of 3: " + i);
            }
        }
    }

    //for loop
    private static void forLoop() {
        for (int i = 0; i < arrayList.length; i++) {
            if (!(arrayList[i] % 3 == 0)) {
                System.out.println("These numbers are NOT multiples of 3: " + arrayList[i]);
            }
        }
    }

    // while loop
    private static void whileLoop() {
        int i = 0;
        while (i < arrayList.length) {
            if (!(arrayList[i] % 3 == 0)) {
                System.out.println("These numbers are NOT multiples of 3: " + arrayList[i]);
            }
            i++;
        }
    }

    // do while loop
        private static void doWhileLoop () {

            int i = 0;

            do{
                if(!(arrayList[i] % 3 == 0)){
                    System.out.println("These numbers are NOT multiples of 3: " + arrayList[i]);
                }i++;
            }while (i < arrayList.length);
        }
    }

