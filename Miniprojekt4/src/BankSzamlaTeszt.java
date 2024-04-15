public class BankSzamlaTeszt {
    public static void main(String[] args) {
        RegularisSzamla reg = new RegularisSzamla(1000,"RegularisSzamla",3421);
        FolyoSzamla foly = new FolyoSzamla(2310,"FolyoSzamla",4241);
        FolyoSzamla foly1 = new FolyoSzamla(3310,"FolyoSzamla",4241);
        FolyoSzamla foly2 = new FolyoSzamla(4520,"FolyoSzamla2",5212);
        TakarekSzamla tak = new TakarekSzamla(450,"TakarekSzamla",5311,5.5);
        TakarekSzamla tak1 = new TakarekSzamla(1450,"TakarekSzamla",5311,5.5);
        TakarekSzamla tak2 = new TakarekSzamla(2350,"TakarekSzamla2",4231,6.5);

        //Regularis Szamla
        reg.betesz(1000);
        System.out.println(reg.getEgyenleg());
        reg.kivesz(100);
        System.out.println(reg.getEgyenleg());

        //Folyoszamla
        System.out.println("-----------------------");
        foly.betesz(1000);
        System.out.println(foly.getEgyenleg());
        foly.kivesz(100);
        System.out.println(foly.getEgyenleg());
        foly.betesz(2000);
        foly.kivesz(500);
        foly.kivesz(350);
        System.out.println(foly.getEgyenleg());
        //Koltseg levonas teszt
        System.out.println("Koltseg levonas utan: "); //5 tranzakcio volt tehat 4-et kell kivonjon
        foly.levonKoltseg();
        System.out.println(foly.getEgyenleg());

        //Takarek szamla
        System.out.println("-----------------------");
        tak.betesz(1000);
        System.out.println(tak.getEgyenleg());
        tak.kivesz(100);
        System.out.println(tak.getEgyenleg());
        //Kamat teszt
        tak.hozzaadKamat();
        System.out.println("Egyenleg kamat hozzaadas utan: ");
        System.out.println(tak.getEgyenleg());

        //Szamlak kiirasa
        System.out.println("----------------------");
        System.out.println(reg);
        System.out.println(foly);
        System.out.println(foly1);
        System.out.println(foly2);
        System.out.println(tak);
        System.out.println(tak1);
        System.out.println(tak2);

        //Equals teszt
        System.out.println("----------------------");
        System.out.println(foly.equals(foly1)); //true-t kell adjon, mivel egyeznek a szamlak

        System.out.println("----------------------");
        System.out.println(tak.equals(tak1));   //true-t kell adjon, mivel egyeznek a szamlak

        System.out.println("----------------------");
        System.out.println(foly.equals(foly2)); //false-t kell adjon, mivel nem egyeznek a szamlak

        System.out.println("----------------------");
        System.out.println(tak.equals(tak2));   //false-t kell adjon, mivel nem egyeznek a szamlak

        //DEPOSIT tranzakciok listazasa
        System.out.println("----------------------");
        System.out.println(foly.tulNev + " DEPOSIT - jai:" );
        for (Tranzakcio tranzakcio: foly.tranzakciok) {
            if (tranzakcio.tranzTipus == Tranzakcio.TranzakcioTipus.DEPOSIT) {
            System.out.println(tranzakcio);
            }
        }
    }
}
