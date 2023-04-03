public class Main {
    public static void main(String[] args) {

        //declare array dimensions as constant values
        final int NUM_ROWS = 4;
        final int NUM_COLS = 4;

        int[][] my2DArray = new int[NUM_ROWS][NUM_COLS];
        double[][] anotherArray = {{2,3,4},
                {5,6,7},
                {8,9,10}};

        //initializes a 2d array using a loop
        for(int row = 0; row < NUM_ROWS; row++){
            for(int col = 0; col < NUM_COLS; col++){
                my2DArray[row][col] = row*col;
            }
        }

        System.out.println();
        //prints all elements in a 2d array, tab separated
        for(int row = 0; row < NUM_ROWS; row++){
            for(int col = 0; col < NUM_COLS; col++){
                System.out.print(my2DArray[row][col] + "\t");
            }
            System.out.println();
        }

        //summing a given row in a 2d array
        int sum = 0;
        for(int col = 0; col < NUM_COLS; col++){
            sum += my2DArray[1][col];
        }
        System.out.println("The sum is " + sum);

        //prints the sum of each row in an array
        for(int row = 0; row < NUM_ROWS; row++) {
            int rowSum = 0;
            for (int col = 0; col < NUM_COLS; col++) {
                rowSum += my2DArray[row][col];
            }
            System.out.println("The sum of row " + row + " is " + rowSum);
        }

        //things to talk about when we come back from break:
        //1) Use .length as a bound and how this works
        //What does it mean when you do "arrayName.length" with a 2D array?
        //What does it mean when you do "arrayName[n].length" with a 2D array?

        //array of grades with student n in each row and test n in each column

        int[][] gradeBook = {{50,60,70,80,90},
                            {70, 50, 40, 100},
                            {100, 50, 60, 80},
                            {30, 90, 100, 100}};

        //print all the test score
        for (int i = 0; i < gradeBook.length; i++) {
            for (int j = 0; j < gradeBook[i].length; j++) {
                System.out.print(gradeBook[i][j] + " ");
            }
            System.out.println();
        }

        // prints average of test scores for each student
        for (int student = 0; student < gradeBook.length; student++) {
            int testScores = 0;
            for (int exam = 0; exam < gradeBook[student].length; exam++) {
                testScores += gradeBook[student][exam];
            }
            double testAvg = testScores/(double)(gradeBook[student].length);
            System.out.println("Student " + (student + 1) + ": Test Average is " + testAvg);
        }
    }
}