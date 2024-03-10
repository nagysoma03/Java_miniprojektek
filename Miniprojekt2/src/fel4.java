public class fel4 {
    public static void compressChar(String str) {
        String newStr = "";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr = str.charAt(i) + String.valueOf(count);
                System.out.print(newStr);
                count = 1;
            }
        }
        newStr = str.charAt(str.length() - 1) + String.valueOf(count);
        System.out.print(newStr);
    }

    public static void main(String[] args) {
        String str = "aaabbbcc";
        String str2 = "aabbaaccllla";
        System.out.print("String 1: ");
        compressChar(str);
        System.out.print("\nString 2: ");
        compressChar(str2);
    }
}
