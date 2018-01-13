package aco11_1.week3.circus;

import aco11_1.week3.circus.roles.Artist;
import aco11_1.week3.circus.roles.ArtistCompareByDrinks;
import aco11_1.week3.circus.roles.ArtistCompareByPlay;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfArtists {
    private ArrayList<Artist> allArtists;
    private int countOfArtists;
    private String adress;

    public GroupOfArtists() {
    }

    public void printArtist(Artist artist) {
        System.out.println(artist.getName() + ", " + artist.getAvailableMoney() + ", " + artist.getSalary() + ", " +
                artist.getCountOfPlay() + ", " + artist.getCountOfDrinks());
    }

    public void printAllArtists() {
        System.out.printf("Total number of artists : %d \n", countOfArtists);
        for (Artist artist : allArtists) {
            printArtist(artist);
        }
    }

    public void printCountOfPlays(Artist artist) {
        System.out.println(artist.getName() + ", Count of play: " +
                artist.getCountOfPlay());
    }

    public void printAllCountOfPlays() {
        for (Artist artist : allArtists) {
            printCountOfPlays(artist);
        }
    }

    public void addArtist(Artist artist) {
        allArtists.add(artist);
        countOfArtists++;
    }

    public void fireArtist(Artist artist) {
        allArtists.remove(artist);
        countOfArtists--;
    }

    public ArrayList<Artist> getAllArtists() {
        return allArtists;
    }

    public void setAllArtists(ArrayList<Artist> allArtists) {
        this.allArtists = allArtists;
    }


    public void paySalaryForAll() {

        for (Artist artist : allArtists) {
            artist.paySalary();
        }
    }

    public void sortByCountOfdrinks() {

        ArtistCompareByDrinks artistCompareByDrinks = new ArtistCompareByDrinks();
        allArtists.sort(artistCompareByDrinks);
    }

    public void sortByCountOfPlay() {

        allArtists.sort(new ArtistCompareByPlay());
    }

    public int getCountOfArtists() {
        return countOfArtists;
    }

    public void setCountOfArtists(int countOfArtists) {
        this.countOfArtists = countOfArtists;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void sortByName() {
       Artist[] forSort = toArr(allArtists);
       Arrays.sort(forSort);
        for (int i = 0; i < forSort.length; i++) {
            allArtists.set(i, forSort[i]);
        }
    }

    private Artist[] toArr(ArrayList<Artist> allArtists) {
        return allArtists.toArray(new Artist[allArtists.size()]);
    }


    }

