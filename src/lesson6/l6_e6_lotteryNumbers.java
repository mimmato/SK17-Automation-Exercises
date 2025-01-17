package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class l6_e6_lotteryNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> userNumbersList = new ArrayList<>();

        ArrayList<Integer> winningNumbersList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int randomWinningNumber = (int)(Math.random() * 50) + 1;
            winningNumbersList.add(randomWinningNumber);
        }
//        System.out.println(winningNumbersList);

        while(true){
            System.out.println("Please choose an option: " + "\n" +
                    "1. Add your a number (up to 5 numbers)" + "\n" +
                    "2. View numbers you added" + "\n" +
                    "3. View winning numbers" + "\n" +
                    "4. Check if a number if a winning number" + "\n" +
                    "5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:

                    if (userNumbersList.size() < 5) {
                        System.out.println("Add a number: ");
                        Integer userNumber = scanner.nextInt();
                        userNumbersList.add(userNumber);
                        System.out.println(userNumber + " added");
                    } else{
                            System.out.println("Maximum numbers 5/5 reached!!!");
                        }
                    break;
                case 2:
                        System.out.println("Numbers in lottery: "  + userNumbersList);
                    break;
                case 3:
                    System.out.println("The winning numbers are: " + winningNumbersList);

                case 4:
                    System.out.println("Enter a number to check: ");
                    int numberToCheck = scanner.nextInt();
                    boolean isWinningNumber = false;

                        for (Integer i : winningNumbersList) {
                            if (numberToCheck == i) {
                                isWinningNumber = true;
                                break;
                            }
                        }

                    if(isWinningNumber){
                        System.out.println("This is a winning number!");
                    } else{
                        System.out.println("This is not a winning number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
                    }
            }
        }
    }
