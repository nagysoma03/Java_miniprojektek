import java.util.Arrays;

public class fel6 {
    static void tombOsszehasonlitas(int[] array1, int[] array2) {
        if (Arrays.equals(array1, array2)) {
            System.out.println("A ket tomb egyenlo!");
        } else {
            System.out.println("A tombok nem egyenloek!");
        }
    }

    public static void main(String[] args) {
        int[] iArray1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iArray3 = {0, 1, 3, 5, 6, 11, 55};
        tombOsszehasonlitas(iArray1, iArray2);
        tombOsszehasonlitas(iArray1, iArray3);
    }
}
