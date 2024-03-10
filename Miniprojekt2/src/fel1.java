import java.util.Scanner;

public class fel1 {
    public static void firstLastChar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.next();
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        System.out.println("First character:" + first);
        System.out.println("Last character:" + last);
    }

    public static void main(String[] args) {
        firstLastChar();
    }
}

