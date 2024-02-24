import java.util.Scanner;

public class fel3 {
    static void szamolo() {
        while (true) {
            Scanner beolvas = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int elsoSzam = beolvas.nextInt();
            System.out.print("Enter second number: ");
            int masodikSzam = beolvas.nextInt();
            System.out.print("""
                    Enter 1 for addition
                    Enter 2 for subtraction
                    Enter 3 for multiplication
                    Enter 4 for division
                    Enter 5 to Exit
                    """);
            int eredmeny = 0;
            int operator = beolvas.nextInt();
            if (operator == 1) {
                eredmeny = elsoSzam + masodikSzam;
            }
            if (operator == 2) {
                eredmeny = elsoSzam - masodikSzam;
            }
            if (operator == 3) {
                eredmeny = elsoSzam * masodikSzam;
            }
            if (operator == 4) {
                eredmeny = elsoSzam / masodikSzam;
            }
            if (operator == 5) {
                break;
            }
            System.out.println("Result: " + eredmeny);
        }
    }

    public static void main(String[] args) {
        szamolo();
    }
}
