public class Demo {
    public static void main(String[] args) {
        //int[] rollNums = new int[3];
        int rollNums[] = new int[3];
        // 101, 102, 103

        // rollNums[0] = 101;
        // rollNums[1] = 102;
        // rollNums[2] = 103;

        // System.out.println(rollNums[0]);
        // System.out.println(rollNums[1]);
        // System.out.println(rollNums[2]);

        // System.out.println(rollNums.length);

        int x = 101;
        for(int i=0; i < rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }

        for(int i=0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }
    }
}