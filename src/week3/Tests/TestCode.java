package week3.Tests;

import week3.Cyrcus.GroupOfArtists;
import week3.Cyrcus.Roles.Acrobat;
import week3.Cyrcus.Roles.Artist;
import week3.Cyrcus.Roles.Clown;
import week3.Cyrcus.Roles.TightropeWalker;

import java.util.ArrayList;

public class TestCode {
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

        acrobat1.drink(2);
        acrobat2.drink(1);

        testAddNewArtist(circusArtists);
        testFireDrinkingArtist(circusArtists);
        testArtistPlay(circusArtists);
        testChangeLocation(circusArtists);
        testPayMoney(circusArtists);

        System.out.println("-----");
        testViewAllArtists(circusArtists);
    }

    private static void testPayMoney(GroupOfArtists circusArtists) {
        circusArtists.paySalaryForAll();

        for (Artist artist : circusArtists.getAllArtists()){
            if(artist.getName().equals("Iurii2")){
                System.out.println(artist.getSalary());
                System.out.println((artist.getAvailableMoney() == 2850) + " testPayMoney");
            }
        }
    }

    private static void testChangeLocation(GroupOfArtists circusArtists) {
        circusArtists.setAdress("Lviv");
        System.out.println((circusArtists.getAdress().equalsIgnoreCase("lviv")) + " testChangeLocation");
    }

    private static void testArtistPlay(GroupOfArtists circusArtists) {
        for (Artist artist : circusArtists.getAllArtists()) {
            artist.play();
            System.out.println((artist.getCountOfPlay() == 1) + " testArtistPlay");
            break;
        }
    }

    private static void testFireDrinkingArtist(GroupOfArtists circusArtists) {
        circusArtists.sortByCountOfdrinks();

        for (Artist artist : circusArtists.getAllArtists()) {
            if (artist instanceof Acrobat) {
                System.out.println((artist.getName().equalsIgnoreCase("Iurii1")) +  " testFireDrinkingArtist");
                circusArtists.fireArtist(artist);
                break;
            }
        }
    }

    private static void testAddNewArtist(GroupOfArtists circusArtists) {
        Artist clown3 = new Clown("Serhii3", 3500, 0, 0);
        circusArtists.addArtist(clown3);
        System.out.println((circusArtists.getCountOfArtists() == 9) + " testAddNewArtist");
    }

    private static void testViewAllArtists(GroupOfArtists circusArtists) {
        circusArtists.printAllArtists();
    }
}
