import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata;

    public void hozzaadKamat() {
        this.egyenleg += this.egyenleg * kamatRata/100;
    }

    @Override
    public String toString() {
        return "TakarekSzamla: " +
                "kamatRata = " + kamatRata +
                ", egyenleg = " + egyenleg +
                ", tulNev = '" + tulNev + '\'' +
                ", szamlaSzam = " + szamlaSzam +
                ", tranzakciok = " + tranzakciok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakarekSzamla that = (TakarekSzamla) o;
        return kamatRata == that.kamatRata && Objects.equals(tulNev, that.tulNev) && szamlaSzam == that.szamlaSzam;
    }

    public TakarekSzamla(double egyenleg, String tulNev, int szamlaSzam, double kamatRata) {
        super(egyenleg, tulNev, szamlaSzam);
        this.kamatRata = kamatRata;
    }
}
