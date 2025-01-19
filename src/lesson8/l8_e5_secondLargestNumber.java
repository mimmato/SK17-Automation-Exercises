package lesson8;

public class l8_e5_secondLargestNumber {
    public static void main(String[] args) {
        System.out.println("This number is the seconds largest from the array: ");
        secondLargest();
    }

    static int[] arrayList = {17, 11, 23, 10, 20, 30, 40, 50};

    private static void secondLargest() {

        int secondBigger = 0;
        boolean isSecondBigger = false;

            for (int number : arrayList) {
                if (secondBigger < number) {
                    secondBigger = number;

                    if (isSecondBigger){
                        System.out.println(number);
                        break;
                    } isSecondBigger = true;
                }
            }
        }
    }

