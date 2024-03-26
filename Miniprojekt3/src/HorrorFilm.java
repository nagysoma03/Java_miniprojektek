import static java.lang.Math.abs;

public class HorrorFilm extends Film implements IKorhataros{
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return this.korh;
    }

    @Override
    public int Buntetes(int kor) {
        if ((kor-this.korh) < 0) {
            return abs((kor - this.korh)) * this.getAr();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Film cime: " + this.getCim() + ", Film ara: " + this.getAr() + ", Korhatar: " + this.korh;
    }
}
