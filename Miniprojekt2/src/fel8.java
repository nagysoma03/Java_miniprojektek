import java.util.Arrays;

public class fel8 {
    public static void arraySort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {11, 12, 14, 1, 2, 4, 7, 5, 6, 8};
        arraySort(array);
    }
}
