package lesson13.exercise1_patterns;

public class rightAlignedTriangle {
//                      *
//                     **
//                    ***
//                   ****
//                  *****
public static void main(String[] args) {

    int numberOfRows = 5;

    for (int i = 0; i < numberOfRows; i++){

        int numberOfSpaces = numberOfRows - (i + 1);
        int numberOfStars = i + 1;

        String spaces = " ".repeat(numberOfSpaces);
        String stars = "*".repeat(numberOfStars);

        System.out.println(spaces + stars);

        // 4 spaces on row 1 + 1 star
        // 3 spaces on row 2 + 2 stars
    }


}

}
