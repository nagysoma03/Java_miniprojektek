import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));
        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();

        System.out.println("--------------------");
        //System.out.println(new File(".").getAbsolutePath()); //Szükség volt az absolute path megnézésére, mivel nem találta a fájlt
        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();
        System.out.println("--------------------");

        //Jegyek beolvasasa
        String path = ("jegyek.csv");
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));   //A beolvasashoz ezt a videot hasznaltam:
                                                                // https://www.youtube.com/watch?v=-Aud0cDh-J8&t=592s
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String tantargy = values[1];
                int jegy = Integer.parseInt(values[2]);

                Jegy jegyek = new Jegy(tantargy, jegy);
                naplo.ujJegy(id, jegyek);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        naplo.listazHallgatoiAdatok();

    }
}
