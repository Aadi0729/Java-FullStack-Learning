public class Demo2 {
    public static void main(String[] args) {
        // Multi dimensional arrays:

        // int[][] marks = new int[3][3];  // rows, cols
        // marks[0][0] = 23;
        // marks[0][1] = 25;
        // marks[0][2] = 45;

        // marks[1][0] = 34;
        // marks[1][1] = 11;
        // marks[1][2] = 90;

        // marks[2][0] = 56;
        // marks[2][1] = 23;
        // marks[2][2] = 78;

        // for(int row = 0; row < marks.length; row++) {
        //     for(int col = 0; col < marks[row].length; col++) {
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // Multi dimensional array --> each woth diff length

        // int[][] marks = new int[3][]; // rows = 3

        // marks[0] = new int[1];
        // marks[1] = new int[2];
        // marks[2] = new int[3];

        // marks[0][0] = 23;

        // marks[1][0] = 24;
        // marks[1][1] = 90;

        // marks[2][0] = 12;
        // marks[2][1] = 78;
        // marks[2][2] = 45;

        // /*
        //     [23]
        //     [24] [90]
        //     [12] [78] [45]
        // */


        // for(int row = 0; row < marks.length; row++) {
        //     for(int col = 0; col < marks[row].length; col++) {
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // 1-D array
        // int[] rollNums = {101, 102, 103};

        // for(int i=0; i<rollNums.length; i++) {
        //     System.out.println(rollNums[i]);
        // }

        // 2-D array
        int[][] marks = {
            {12, 14, 56},
            {34, 45, 67},
            {45, 67, 78}
        };

        for(int row = 0; row < marks.length; row++) {
            for(int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

    }
}