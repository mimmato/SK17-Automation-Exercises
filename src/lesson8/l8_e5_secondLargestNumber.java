package lesson8;

public class l8_e5_secondLargestNumber {
    public static void main(String[] args) {
        System.out.println("The second biggest number from the array is: ");

        //        secondLargestFrom0();

        secondLargestFromArrayLength();
    }
    static int[] numbers = {17, 11, 23, 10, 20, 30, 40, 40, 50, 50, 20, 30};

    private static void secondLargestFromArrayLength() {
        int biggestNumber = numbers[0];
        int secondBiggest = numbers[0];

        for(int number : numbers) {

            if (biggestNumber < number){
                secondBiggest = biggestNumber;
                biggestNumber = number;
            } else if (number > secondBiggest && number < biggestNumber ){
                secondBiggest = number;
            }
        }
        System.out.println(secondBiggest);
    }

    private static void secondLargestFrom0() {

        int secondBigger = 0;
        boolean isSecondBigger = false;

            for (int number : numbers) {
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

