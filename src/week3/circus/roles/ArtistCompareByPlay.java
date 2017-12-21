package week3.circus.roles;

import java.util.Comparator;

public class ArtistCompareByPlay implements Comparator<Artist> {
    @Override
    public int compare(Artist artist1, Artist artist2) {
        if (artist1.getCountOfPlay() < artist2.getCountOfPlay()) {
            return 1;
        } else if (artist1.getCountOfPlay() > artist2.getCountOfPlay()) {
            return -1;
        } else {
            return 0;
        }
    }
}
