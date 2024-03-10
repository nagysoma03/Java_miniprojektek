import java.util.Arrays;

public class fel5 {
    public static void swapArrayElement(int[] array) {
        int arrayElement = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = arrayElement;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 20, 30, 40};
        swapArrayElement(array);
        swapArrayElement(array2);
    }
}
