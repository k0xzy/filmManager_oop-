import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class FilmManagerTest {


    @Test
    public void findAllFilm() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimNorm() {
        FilmsManager manager = new FilmsManager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimMax() {
        FilmsManager manager = new FilmsManager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");

        String[] actual = manager.findLast();
        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimMin() {
        FilmsManager manager = new FilmsManager(10);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] actual = manager.findLast();
        String[] expected = {"film5", "film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }

}
