import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Teszter {
    public static int buntetesSzamit(int kor, ArrayList<IKorhataros> korhFilmek) {
        int buntetes = 0;
        for (IKorhataros film:korhFilmek) {
            buntetes += film.Buntetes(kor);
        }
        return buntetes;
    }
    public static void main(String[] args) {
        Film film1 = new Film("Decision to Leave", 25);
        Film film2 = new Film("Raging Bull", 31);
        Film film3 = new Film("All the Right Moves", 33);
        Film film4 = new Film("Free Fire", 19);
        Film film5 = new Film("Ticket to Paradise", 27);
        Film film6 = new Film("Iron Man 2", 40);

        HorrorFilm horrorFilm1 = new HorrorFilm("Scary Stories to Tell in the Dark", 45, 18);
        HorrorFilm horrorFilm2 = new HorrorFilm("Malignant", 35, 21);
        HorrorFilm horrorFilm3 = new HorrorFilm("Evil Dead II", 49, 16);
        HorrorFilm horrorFilm4 = new HorrorFilm("A Quiet Place", 31, 18);
        HorrorFilm horrorFilm5 = new HorrorFilm("Cube", 24, 24);
        HorrorFilm horrorFilm6 = new HorrorFilm("Under the Skin", 20, 12);

        ArrayList<Film> filmek = new ArrayList<Film>();

        filmek.add(film1);
        filmek.add(film2);
        filmek.add(film3);
        filmek.add(film4);
        filmek.add(film5);
        filmek.add(film6);

        filmek.add(horrorFilm1);
        filmek.add(horrorFilm2);
        filmek.add(horrorFilm3);
        filmek.add(horrorFilm4);
        filmek.add(horrorFilm5);
        filmek.add(horrorFilm6);

        for (Film film:filmek) {
            System.out.println(film);
        }

        //Rendezes ar szerint
        System.out.println("\nFilmek rendezese ar szerint:");
        filmek.sort(Comparator.comparing((Film film) -> (film.getAr())));
        for (Film film:filmek) {
            System.out.println(film);
        }

        //Horrorfilmek kivalogatasa
        System.out.println("\nHorrorfilmek:");
        ArrayList<IKorhataros> horrorFilmek = new ArrayList<IKorhataros>();

        for (Film film:filmek) {
            if (film instanceof HorrorFilm) {
                horrorFilmek.add((IKorhataros) film);
            }
        }

        for (IKorhataros film:horrorFilmek) {
            System.out.println(film);
        }

        //Buntetes kiirasa
        System.out.println(buntetesSzamit(18,horrorFilmek));
        System.out.println(buntetesSzamit(12,horrorFilmek));
        System.out.println(buntetesSzamit(26,horrorFilmek));

    }
}
