public class fel6 {
    static boolean tombOsszehasonlitas(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] iArray1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] iArray3 = {0, 1, 3, 5, 6, 11, 55};
        if (tombOsszehasonlitas(iArray1, iArray2)) {
            System.out.println("A ket tomb egyforma.");
        }
        if (!tombOsszehasonlitas(iArray1, iArray3)) {
            System.out.println("A tombok nem egyformak.");
        }
    }
}
