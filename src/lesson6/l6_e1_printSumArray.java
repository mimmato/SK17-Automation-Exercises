package lesson6;

public class l6_e1_printSumArray {
    public static void main(String[] args) {
//        forLoop();
        forEach();
    }

    static int[] arrayList = {2, 5, 7, 10};
    static int sum = 0;

    // for loop
    private static void forLoop() {

        for (int i = 0; i < arrayList.length; i++) {
            sum += arrayList[i];

        }
        System.out.println("The sum generated with a For loop is: " + sum);
    }

    // for each loop
    private static void forEach() {

        for (int i : arrayList) {
            sum += i;
        }

        System.out.println("The sum generated with a For Each loop is: " + sum);
    }
}




