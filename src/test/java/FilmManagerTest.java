import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void allFilmsTest() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);

        }

    @Test
    public void lastFilmsTestWithLimit() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";

        FilmManager manager = new FilmManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

}

