package lesson6;

public class l6_e4_biggestElement {
    public static void main(String[] args) {

        int[] arrayList = {21, 402, 82, 1001, 2, 1000};

        int biggestElement = arrayList[0];

        for(int i : arrayList){

            if(biggestElement < i){
                System.out.println("Comparing the biggest Element from Array: " + biggestElement + " current number " + i);
                biggestElement = i;
            }
        }
        System.out.println("The biggest number from the array is: " + biggestElement);
    }
}

