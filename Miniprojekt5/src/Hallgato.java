import java.util.ArrayList;

public class Hallgato {
    private static int nextID = 0;
    private final int id;
    private final String vezeteknev;
    private final String keresztnev;
    private ArrayList<Jegy> jegyek = new ArrayList<Jegy>();

    public Hallgato(String vezeteknev, String keresztnev) {
        this.id = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
    }

    public int getId() {
        return id;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargy) {
        int osszeg = 0;
        int db = 0;

        for (Jegy jegy : jegyek) {
            if (jegy.getTantargy().equals(tantargy)) {
                osszeg += jegy.getJegy();
                db += 1;
            }
        }
        if (db == 0) {
            return 0;
        } else {
            return (double) osszeg / db;
        }
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<String>();
        for (Jegy jegy : jegyek) {
            if (!tantargyak.contains(jegy.getTantargy())) {
                tantargyak.add(jegy.getTantargy());
            }
        }
        return new ArrayList<>(tantargyak);
    }

    public void listazas() {
        System.out.println(this.vezeteknev + " " + this.keresztnev);
        for (String tantargy : getTantargyak()) {
            double atlag = tantargyAtlag(tantargy);
            System.out.println("\t" + tantargy + ": " + atlag);
        }
    }
}
