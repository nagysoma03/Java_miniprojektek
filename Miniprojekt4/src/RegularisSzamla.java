import java.util.ArrayList;

public class RegularisSzamla implements BankSzamla {
    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private static int kovSzamlaSzam = 1;

    public ArrayList<Tranzakcio> tranzakciok = new ArrayList<Tranzakcio>();

    private int ujSzamlaSzam() {
        return this.szamlaSzam += kovSzamlaSzam;
    }

    public RegularisSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        this.egyenleg = egyenleg;
        this.tulNev = tulNev;
        this.szamlaSzam = szamlaSzam;
        this.ujSzamlaSzam();
    }

    @Override
    public String toString() {
        return "RegularisSzamla: " +
                "egyenleg = " + egyenleg +
                ", tulNev = '" + tulNev + '\'' +
                ", szamlaSzam = " + szamlaSzam +
                ", tranzakciok = " + tranzakciok;
    }

    @Override
    public double getEgyenleg() {
        return this.egyenleg;
    }

    @Override
    public double betesz(double osszeg) {
        this.tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT,osszeg));
        return this.egyenleg += osszeg;
    }

    @Override
    public double kivesz(double osszeg) {
        tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW,osszeg));
        return this.egyenleg -= osszeg;
    }

}
