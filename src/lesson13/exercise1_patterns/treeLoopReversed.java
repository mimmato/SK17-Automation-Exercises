package lesson13.exercise1_patterns;

public class treeLoopReversed {

    public static void main(String[] args) {

    int numberOfRows = 30;

    for (int i = 1; i < numberOfRows; i++) {
        int row = i - 1;
        int numberOfSpaces = numberOfRows - row;
        int numberOfStars = row + i;

        String spaces = " ".repeat(numberOfSpaces);
        String stars = "*".repeat(numberOfStars);

        System.out.println(spaces + stars);
    }
}
}
