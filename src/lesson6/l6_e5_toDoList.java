package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class l6_e5_toDoList {
    public static void main(String[] args) {
//        nonInteractiveToDoList();
        toDoListSwitch();
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> arrayList = new ArrayList<>();

    private static void nonInteractiveToDoList() {

        System.out.println("This is your to-do list!");

        System.out.println("Please add a new task: ");
        String addTask = scanner.nextLine();
        arrayList.add(addTask);
        // add to array
        while (true) {

            System.out.println("Do you want to add more tasks? yes/no");
            String choice = scanner.nextLine();

            if (choice.equals("no")) {
                break;
            } else {
                System.out.println("Please enter your new task: ");
                String newTask = scanner.nextLine();
                arrayList.add(newTask);
            }
        }

        System.out.println("Here are the items in the ArrayList: " + arrayList);
        // set / modify array
        // sub tasks to be able to modify/set an item based on index
        while (true) {
            System.out.println("Do you wish to modify the previous task?");
            String modify = scanner.nextLine();

            if (modify.equals("no")) {
                break;
            } else {
                System.out.println("Please type in the changes to the previous task or type in completed: ");
                String newTaskModified = scanner.nextLine();
                arrayList.set(0, newTaskModified);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index is: " + i + " and value is " + arrayList.get(i));
        }
        System.out.println("Here are the items in the ArrayList: " + arrayList);

        // remove item from array
        // sub tasks to be able to remove an item based on index

        while (true) {
            System.out.println("Do you wish to remove a previous task?");
            String remove = scanner.nextLine();
            if (remove.equals("no")) {
                break;
            } else {
                System.out.println("Please type in the index of the task you want to remove: ");
                int indexToRemove = scanner.nextInt();
                scanner.nextLine(); // adding as the preceding nextInt will cause failure

                if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                    arrayList.remove(indexToRemove);
                    System.out.println("Removed index: " + indexToRemove);
                } else {
                    System.out.println("No such index number");
                }
            }
        }


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index is: " + i + " and value is " + arrayList.get(i));
        }

        while (true) {
            System.out.println("Do you wish to remove all completed tasks? yes/no");
            String removeCompleted = scanner.nextLine();
            if (removeCompleted.equals("no")) {
                break;
            } else {
                arrayList.removeIf(removedTasks -> removedTasks.toLowerCase().contains("completed"));
            }
            System.out.println("Here are the items in the ArrayList: " + arrayList);

        }
    }

    private static void toDoListSwitch() {
        System.out.println("This is your to-do list!");

        ArrayList<Boolean> completedList = new ArrayList<>();
        boolean isMenuActive = true;

        while (isMenuActive) {
            System.out.println("What would you like to do?" + "\n" + "Options:" + "\n" +
                    "1. Add a new task" + "\n" +
                    "2. Mark a Task as Completed" + "\n" +
                    "3. Remove all completed task" + "\n" +
                    "4. Display tasks" + "\n" +
                    "5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Please enter your new task: ");
                    String newTask = scanner.nextLine();
                    arrayList.add(newTask);
                    completedList.add(false);
                    break;

                case 2:
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println("Index is: " + (i + 1) + " and value is " + arrayList.get(i));
                    }
                    System.out.print("Enter the Index number of the task to mark as completed: ");

                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= arrayList.size()) {
                        completedList.set(taskNumber - 1, true);
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    for (int i = arrayList.size() - 1; i >= 0; i--) {
                        if (completedList.get(i)) {
                            arrayList.remove(i);
                            completedList.remove(i);
                        }
                    }
                    System.out.println("Completed tasks removed.");
                    break;
                case 4:
                    System.out.println("\nCurrent Tasks:");
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println((i + 1) + ". " + arrayList.get(i) + (completedList.get(i) ? " (Completed)" : ""));
                    }
                    break;
                case 5:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    scanner.close();
                    //return;
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}