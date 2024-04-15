import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla{

    private int tranzakciokSzama;

    private static final int ingyenesTranzSzama = 3;

    private static final double tranzakcioAra = 2.0;

    public void levonKoltseg() {
        if (tranzakciokSzama > ingyenesTranzSzama) {
            double levonandoOsszeg = tranzakcioAra * (tranzakciokSzama - ingyenesTranzSzama);
            egyenleg -= levonandoOsszeg;
        }
        this.tranzakciokSzama = 0;
    }

    @Override
    public String toString() {
        return "FolyoSzamla: " +
                "tranzakciokSzama = " + tranzakciokSzama +
                ", egyenleg = " + egyenleg +
                ", tulNev = '" + tulNev + '\'' +
                ", szamlaSzam = " + szamlaSzam +
                ", tranzakciok = " + tranzakciok;
    }

    @Override
    public double betesz(double osszeg) {
        this.tranzakciokSzama += 1;
        return super.betesz(osszeg);
    }

    @Override
    public double kivesz(double osszeg) {
        this.tranzakciokSzama += 1;
        return super.kivesz(osszeg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolyoSzamla that = (FolyoSzamla) o;
        return tranzakciokSzama == that.tranzakciokSzama && Objects.equals(tulNev, that.tulNev) && szamlaSzam == that.szamlaSzam;
    }

    public FolyoSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        super(egyenleg, tulNev, szamlaSzam);
    }
}
