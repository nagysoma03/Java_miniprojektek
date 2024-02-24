public class fel5 {
    static boolean stringEllenorzo(String string) {
        for (int i = 0; i < string.length(); i++) {
            char karakterek = string.charAt(i);
            if (Character.isDigit(karakterek)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string1 = "JSysYuXqWf";
        String string2 = "Zo1edARIBl";
        if (stringEllenorzo(string1)){
            System.out.println("A string nem tartalmaz numerikus karaktereket.");
        }
        if (!stringEllenorzo(string2)){
            System.out.println("A string tartalmaz numerikus karaktereket.");
        }
        stringEllenorzo(string2);
    }
}
