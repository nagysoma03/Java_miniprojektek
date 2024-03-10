import java.util.Scanner;

public class fel2 {
    public static void replaceChar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.next();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                ch[i] ='*';
            }
        }
        System.out.println(String.valueOf(ch));
    }

    public static void main(String[] args) {
        replaceChar();
    }
}
