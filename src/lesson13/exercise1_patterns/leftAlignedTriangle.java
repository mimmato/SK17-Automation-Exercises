package lesson13.exercise1_patterns;

//        *
//        **
//        ***
//        ****
//        *****


public class leftAlignedTriangle {
    public static void main(String[] args) {

        int numberOfRows = 5;

        for (int i = 0; i < numberOfRows; i++){

//            int numberOfSpaces = i;
            int numberOfStars = i + 1;

//             String spaces = " ".repeat(numberOfSpaces);
            String stars = "*".repeat(numberOfStars);

            System.out.println(stars);
        }

    }
}
