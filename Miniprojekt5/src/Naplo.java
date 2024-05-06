import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {
    public ArrayList<Hallgato> hallgatok = new ArrayList<Hallgato>();

    public Naplo(String file) {
        String path = file;
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String vezeteknev = values[0];
                String keresztnev = values[1];
                Hallgato hallgato = new Hallgato(vezeteknev,keresztnev);
                hallgatok.add(hallgato);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void listazNevek() {
        for (Hallgato hallgato:hallgatok) {
            System.out.println(hallgato.getId() + ". " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato:hallgatok) {
            if (hallgato.getId() == ID) {
                hallgato.ujBejegyzes(jegy);
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato:hallgatok) {
            hallgato.listazas();
        }
    }
}
