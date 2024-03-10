import java.util.Arrays;

public class fel9 {
    public static void main(String[] args) {
        int[][] array2D = new int[10][10];

        array2D[1][1] = 1;
        array2D[2][2] = 2;
        array2D[3][3] = 3;
        array2D[4][4] = 4;
        array2D[5][5] = 5;
        array2D[6][6] = 6;
        array2D[7][7] = 7;
        array2D[8][8] = 8;
        array2D[9][9] = 9;

        for (int[] rows : array2D) {
            System.out.println(Arrays.toString(rows));
        }

    }
}
