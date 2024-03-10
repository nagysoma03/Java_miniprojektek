public class fel6 {
    public static void findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("A legkisebb elem: " + min);
    }

    public static void findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("A legnagyobb elem: " + max);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -1, 6, 22, 7, 8, 9};
        findMin(array);
        findMax(array);
    }
}
