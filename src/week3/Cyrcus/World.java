package week3.Cyrcus;

import java.util.ArrayList;

public class World {

    public static void main(String[] args) {

        GroupOfArtists cyrcusArtists = new GroupOfArtists();
        cyrcusArtists.setAdress("Kyiv, Centr");

        cyrcusArtists.setAllArtists(new ArrayList<Artist>(10));

        Artist tw1 = new TightropeWalker("Ivan1", 1000,0,0);
        Artist tw2 = new TightropeWalker("Ivan2", 2000,0,0);
        Artist tw3 = new TightropeWalker("Ivan3", 3000,0,0);

        Artist clown1 = new Clown ("Serhii1", 1500,0,0);
        Artist clown2 = new Clown("Serhii2", 2500,0,0);

        Artist acrobat1 = new Acrobat("Iurii1", 1550,0,0);
        Artist acrobat2 = new Acrobat("Iurii2", 2550,0,0);
        Artist acrobat3 = new Acrobat("Iurii3", 3550,0,0);

        cyrcusArtists.addArtist(tw1);
        cyrcusArtists.addArtist(tw2);
        cyrcusArtists.addArtist(tw3);

        cyrcusArtists.addArtist(clown1);
        cyrcusArtists.addArtist(clown2);

        cyrcusArtists.addArtist(acrobat1);
        cyrcusArtists.addArtist(acrobat2);
        cyrcusArtists.addArtist(acrobat3);


        //1) посмотреть список артистов.

        cyrcusArtists.printAllArtists();

        //2) нанять на работу нового циркача.

        Artist clown3 = new Clown("Serhii3", 3500,0,0);
        cyrcusArtists.addArtist(clown3);

        // 3) уволить самого пьющего акробата.

        acrobat1.drink(2);
        acrobat2.drink(1);

       cyrcusArtists.sortByCountOfdrinks();

        for (Artist artist: cyrcusArtists.getAllArtists()) {
            if (artist instanceof Acrobat){
                cyrcusArtists.fireArtist(artist);
                break;
            }
        }


        //4) Отправить кого-то выступать (каждый выступает по разному)

        acrobat1.play();
        clown2.play();
        tw1.play();

        // 5) Узнать сколько раз выступал каждый из сотрудников

        cyrcusArtists.printAllCountOfPlays();

        //6) Выплалить зарплату артисттам (канатоходцам доп % за риски)

        cyrcusArtists.paySalaryForAll();
        cyrcusArtists.printAllArtists();

        // 7) переехать на другое место

        cyrcusArtists.setAdress("Lviv");
        System.out.println(cyrcusArtists.getAdress());

    }
}
