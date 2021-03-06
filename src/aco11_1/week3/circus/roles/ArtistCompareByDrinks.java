package aco11_1.week3.circus.roles;

import java.util.Comparator;

public class ArtistCompareByDrinks implements Comparator<Artist> {

    @Override
    public int compare(Artist artist1, Artist artist2) {
        if (artist1.getCountOfDrinks() < artist2.getCountOfDrinks()) {
            return 1;
        } else if (artist1.getCountOfDrinks() > artist2.getCountOfDrinks()) {
            return -1;
        } else {
            return 0;
        }
    }
}
