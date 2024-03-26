import java.util.ArrayList;
import java.util.Arrays;

public class Film {
    private String cim;
    private int ar;
    public int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemeny >= 1 && velemeny <= 5) {
            for (int i = 0; i < this.velemenyek.length; i++) {
                if (this.velemenyek[i] == 0) {
                    this.velemenyek[i] = velemeny;
                }
            }
        } else {
            System.out.println("A velemenynek 1-5 kozott kell lennie!");
        }
    }

    public int Atlag() {
        int ossz = 0;
        int db = 0;
        for (int i = 0; i < this.velemenyek.length; i++) {
            if (this.velemenyek[i] != 0) {
                ossz += this.velemenyek[i];
                db += i;
            }
        }
        if ((ossz / db) == 0) {
            System.out.println("Ez a film meg nem kapott velemenyt.");  //Ha a velemenyek atlaga 0 akkor a film nem kapott egy velemenyt sem
        }
        return (ossz / db);
    }

    @Override
    public String toString() {
        return "Film cime: " + cim + ", Film ara: " + ar;
    }
}
