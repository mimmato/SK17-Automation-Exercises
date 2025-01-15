package lesson4;

import java.util.Scanner;

public class l4_e2_daysOfTheWeek {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a digit from 1 to 7: ");

        int day = scanner.nextInt();

        String dayOfWeek = "";
        String suffix = "";

        if (day == 1) {
            dayOfWeek = "Monday";
            suffix = "st";
        }else if (day == 2){
            dayOfWeek = "Tuesday";
            suffix = "nd";
        }else if (day == 3){
            dayOfWeek = "Wednesday";
            suffix = "rd";
        }else if (day == 4){
            dayOfWeek = "Thursday";
            suffix = "th";
        }else if (day == 5){
            dayOfWeek = "Friday";
            suffix = "th";
        }else if (day == 6){
            dayOfWeek = "Saturday";
            suffix = "th";
        }else  {
            dayOfWeek = "Sunday";
            suffix = "th";

        }
        System.out.println("The " + day + suffix + " day of the week is " + dayOfWeek);

    }
}
