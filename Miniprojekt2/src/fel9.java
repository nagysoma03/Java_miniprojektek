import java.util.Arrays;

public class fel9 {
    public static void twoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) {
                    array[i][j] = i;
                }
            }
        }
        for (int[] rows : array) {
            System.out.println(Arrays.toString(rows));
        }
    }

    public static void main(String[] args) {
        int[][] array2D = new int[10][10];
        twoDimensionalArray(array2D);
    }
}
