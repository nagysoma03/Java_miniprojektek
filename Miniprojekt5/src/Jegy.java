public class Jegy {
    private final String tantargy;
    private final int jegy;

    public String getTantargy() {
        return tantargy;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Jegy{" +
                "tantargy='" + tantargy + '\'' +
                ", jegy=" + jegy +
                '}';
    }

    public Jegy(String tantargy, int jegy) {
        this.tantargy = tantargy;
        this.jegy = jegy;
    }
}
