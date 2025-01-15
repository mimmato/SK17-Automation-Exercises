package lesson5;

public class l5_e6_averageInList {
    public static void main(String[] args) {
//        forEach();
//        forLoop();
    }

    static int[] arrayList = {2, 5, 22, 10, 4};
    static double sum = 0;

    // for loop
    private static void forLoop() {

        int i = 0;
        for (i = 0; i < arrayList.length; i++) {
            sum += arrayList[i];

        }
        System.out.println("Average = sum divided by array length: " + sum / arrayList.length);
    }


    // for each
    private static void forEachLoop() {
        for (int i : arrayList) {
            sum += i;
        }
        System.out.println("Average = sum divided by array length: " + sum / arrayList.length);
    }
}