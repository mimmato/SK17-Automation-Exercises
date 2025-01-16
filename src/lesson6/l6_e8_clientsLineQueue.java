package lesson6;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class l6_e8_clientsLineQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<String> clientsQueue = new LinkedList<>();

        while (true) {
            System.out.println("Please choose an option: " + "\n" +
                    "1. Add a new client to the queue" + "\n" +
                    "2. View all waiting clients in the queue" + "\n" +
                    "3. Mark a client as served" + "\n" +
                    "4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter client name: ");
                    String newClient = scanner.nextLine();
                    clientsQueue.add(newClient);
                    System.out.println(newClient + " added to queue");
                    break;
                case 2:
                     System.out.println(clientsQueue);
                    break;
                case 3:
                    if(!clientsQueue.isEmpty()){
                        String servedClient = clientsQueue.poll();
                        System.out.println("First client - " + servedClient + " is served");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

