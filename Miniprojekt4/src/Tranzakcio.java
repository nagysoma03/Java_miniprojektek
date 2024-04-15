import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {
    public LocalDateTime idopont = LocalDateTime.now();
    public TranzakcioTipus tranzTipus;
    public enum TranzakcioTipus {
        DEPOSIT,
        WITHDRAW
    }
    public double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
        this.idopont = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Tranzakcio: " +
                idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) +
                ", " + tranzTipus +
                ", osszeg = " + osszeg;
    }
}
