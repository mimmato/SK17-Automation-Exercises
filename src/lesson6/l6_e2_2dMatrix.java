package lesson6;

public class l6_e2_2dMatrix {
    public static void main(String[] args) {
        multiArray();
    }

    public static void multiArray(){

        int[][] multiArray = {
                {22, 33, 44},
                {55, 66, 77},
                {88, 99, 0},
                {34, 54, 65}
        };
        for(int row=0; row < multiArray.length; row++ ){
            for(int column=0; column < multiArray[row].length; column++ ){
                System.out.println("This is the value of row " + row + " and column " + column + ": " +  + multiArray[row][column]);
            }
        }

    }
}
