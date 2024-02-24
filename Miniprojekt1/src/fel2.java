import java.util.Scanner;

public class fel2 {
    static void jelszotEllenoriz(String jelszo) {
        int i = 1;
        while (i <= 3) {
            Scanner beolvas = new Scanner(System.in);
            String beolvasottJelszo = beolvas.nextLine();
            if (jelszo.equals(beolvasottJelszo)) {
                System.out.println("Sikeres belepes!");
                break;
            } else {
                int probalkozas = 3 - i;
                if (probalkozas == 0) {
                    System.out.println("Hibas jelszo! Nincs tobb probalkozasa!");
                } else {
                    System.out.println("Hibas jelszo! Meg " + probalkozas + " probalkozasa maradt.");
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        String jelszo = "abcd";
        jelszotEllenoriz(jelszo);
    }
}
