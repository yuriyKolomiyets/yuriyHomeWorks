package week3.tests;

import week3.circus.GroupOfArtists;
import week3.circus.roles.Acrobat;
import week3.circus.roles.Artist;
import week3.circus.roles.Clown;
import week3.circus.roles.TightropeWalker;
import java.util.ArrayList;


public class TestCompares {

    public static void main(String[] args) {

        GroupOfArtists circusArtists = new GroupOfArtists();
        circusArtists.setAdress("Kyiv, Centr");

        circusArtists.setAllArtists(new ArrayList<Artist>(10));

        Artist tw1 = new TightropeWalker("Ivan1", 1000, 0, 0);
        Artist tw2 = new TightropeWalker("Ivan2", 2000, 0, 0);
        Artist tw3 = new TightropeWalker("Ivan3", 3000, 0, 0);

        Artist clown1 = new Clown("Serhii1", 1500, 0, 0);
        Artist clown2 = new Clown("Serhii2", 2500, 0, 0);

        Artist acrobat1 = new Acrobat("Iurii1", 1550, 0, 0);
        Artist acrobat2 = new Acrobat("Iurii2", 2550, 0, 0);
        Artist acrobat3 = new Acrobat("Iurii3", 3550, 0, 0);

        circusArtists.addArtist(tw1);
        circusArtists.addArtist(tw2);
        circusArtists.addArtist(tw3);

        circusArtists.addArtist(clown1);
        circusArtists.addArtist(clown2);

        circusArtists.addArtist(acrobat1);
        circusArtists.addArtist(acrobat2);
        circusArtists.addArtist(acrobat3);

        testSortByName(circusArtists);

    }

    private static void testSortByName(GroupOfArtists circusArtists) {
        circusArtists.sortByName();

    }
}
