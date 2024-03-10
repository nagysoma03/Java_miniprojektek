import java.util.Arrays;

public class fel7 {
    public static void findRecurringElements(int[] array) {
        int count = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    newArray[count++] = array[i];
                }
            }
        }
        System.out.print("Tobbszor elofordulo elemek: ");
        for (int i = 0; i < count; i++) {
            if (newArray[i] != newArray[i+1]) {
                System.out.print(newArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 3, 4, 5, 6};
        findRecurringElements(array);
    }
}
