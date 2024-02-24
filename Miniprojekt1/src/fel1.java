public class fel1 {
    static void szorzotabla(int szam) {
        if (szam >= 1 && szam <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(szam + " x " + i + " = " + szam * i);
            }
        } else {
            System.out.println("A szam nem 1 es 10 kozott van!");
        }
    }

        public static void main (String[]args){
            int szam1 = 9;
            int szam2 = 0;
            int szam3 = -9;
            szorzotabla(szam1);
            szorzotabla(szam2);
            szorzotabla(szam3);
        }
    }
