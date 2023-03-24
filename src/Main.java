public class Main {
    public static void main(String[] args) {
        final int NUM_ROWS = 5;
        final  int NUM_COLS = 7;
        int[][] my2DArray = new int[NUM_ROWS][NUM_COLS];
        double[][] anotherArray = {{2,3,4},
                                    {5,6,7},
                                    {8,9,10}};

        //prints multiplication table.
        for (int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                my2DArray[row][col] = row*col;
            }
        }

        //prints array.
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                System.out.print(my2DArray[row][col] + "\t");
            }
            System.out.println();
        }
            //prints the sum of a designated row in an array.
            int sum = 0;
            for (int col = 0; col < NUM_COLS; col++) {
                sum += my2DArray[1][col];
            }
            System.out.println("The sum is " + sum);

        //prints the sum of each row in an array
        for (int row = 0; row < NUM_ROWS; row++) {
            int rowSum = 0;
            for (int col = 0; col < NUM_COLS; col++) {
                rowSum += my2DArray[row][col];
            }
            System.out.println("The sum of the row " + row + " is " + rowSum);
        }
    }
}