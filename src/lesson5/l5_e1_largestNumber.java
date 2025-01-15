package lesson5;

public class l5_e1_largestNumber {
    public static void main(String[] args) {

        int[] numbers = {112, 15, 32, 42, 55, 75, 122, 132, 200, 150, 180};

        int biggestNumber = numbers[0];

        for(int number : numbers) {

            if (biggestNumber < number){
                System.out.println("Comparing the biggest number: " + biggestNumber + " to the current number: " + number);

                biggestNumber = number;
            }
        }
        System.out.println("The biggest number from the array is: " + biggestNumber);

    }
}
