package week3.Cyrcus;

import java.util.ArrayList;

public class GroupOfArtists {
    private ArrayList<Artist> allArtists;
    private int countOfArtists;
    private String adress;

    public GroupOfArtists() {
    }

    void printArtist(Artist artist) {
        System.out.println(artist.getName() + ", " + artist.getAvailableMoney() + ", " + artist.getSalary() + ", " +
                artist.getCountOfPlay() + ", " + artist.getCountOfDrinks());
    }

    void printAllArtists() {
        System.out.printf("Total number of artists : %d \n", countOfArtists);
        for (Artist artist : allArtists) {
            printArtist(artist);
        }
    }

    void printCountOfPlays(Artist artist) {
        System.out.println(artist.getName() + ", Count of play: " +
                artist.getCountOfPlay());
    }

    void printAllCountOfPlays() {
        for (Artist artist : allArtists) {
            printCountOfPlays(artist);
        }
    }

    void addArtist(Artist artist) {
        allArtists.add(artist);
        countOfArtists++;
    }

    void fireArtist(Artist artist) {
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

        //
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
}
