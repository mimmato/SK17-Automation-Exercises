package lesson8;

public class l8_e2_averageNumbersMethod {
    public static void main(String[] args) {
        System.out.println("Average = sum divided by array length: ");
        averageOf3();

    }
    private static void averageOf3() {
        int[] numbers = {2, 5, 22};
        double sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            System.out.println(sum / numbers.length);
        }
    }

