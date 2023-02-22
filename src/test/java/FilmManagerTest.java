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


    @Test
    public void lastFilmsTestWithBasicLimit() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";
        String film4 = "MovIV";
        String film5 = "MovV";
        String film6 = "MovVI";
        String film7 = "MovVII";
        String film8 = "MovVII";
        String film9 = "MovIX";
        String film10 = "MovX";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void lastFilmsTestWithGroupBiggerLimit() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";
        String film4 = "MovIV";
        String film5 = "MovV";
        String film6 = "MovVI";
        String film7 = "MovVII";
        String film8 = "MovVII";
        String film9 = "MovIX";
        String film10 = "MovX";
        String film11 = "MovXI";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilmsTestWithGroupSmallerThanLimit() {
        String film1 = "MovI";
        String film2 = "MovII";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);


        String[] actual = manager.findLast();
        String[] expected = {film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilmsTestWithGroupBiggerCustomLimit() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";
        String film4 = "MovIV";
        String film5 = "MovV";
        String film6 = "MovVI";
        String film7 = "MovVII";
        String film8 = "MovVII";
        String film9 = "MovIX";
        String film10 = "MovX";
        String film11 = "MovXI";

        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilmsTestWithGroupEqualCustomLimit() {
        //String film1 = "MovI";
        //String film2 = "MovII";
        //String film3 = "MovIII";
        //String film4 = "MovIV";
        //String film5 = "MovV";
        //String film6 = "MovVI";
        String film7 = "MovVII";
        String film8 = "MovVII";
        String film9 = "MovIX";
        String film10 = "MovX";
        String film11 = "MovXI";

        FilmManager manager = new FilmManager(5);
        //manager.addFilm(film1);
        //manager.addFilm(film2);
        //manager.addFilm(film3);
        //manager.addFilm(film4);
        //manager.addFilm(film5);
        //manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilmsTestWithGroupLessCustomLimit() {
        String film1 = "MovI";
        String film2 = "MovII";
        String film3 = "MovIII";
        String film4 = "MovIV";
        //String film5 = "MovV";
        //String film6 = "MovVI";
        //String film7 = "MovVII";
        //String film8 = "MovVII";
        //String film9 = "MovIX";
        //String film10 = "MovX";
        //String film11 = "MovXI";

        FilmManager manager = new FilmManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        //manager.addFilm(film5);
        //manager.addFilm(film6);
        //manager.addFilm(film7);
        //manager.addFilm(film8);
        //manager.addFilm(film9);
        //manager.addFilm(film10);
        //manager.addFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }
}

