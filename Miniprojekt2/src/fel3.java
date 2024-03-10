public class fel3 {
    public static void deleteChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (newStr.indexOf(ch) < 0) {
                newStr += String.valueOf(ch);
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "ababbcdc";
        String str2 = "asdadsadadwadawdwadwa";
        deleteChar(str);
        deleteChar(str2);
    }
}
