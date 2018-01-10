package week05;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] forSort = {0, 2, 3, 4, 5, 6, 7, 8, 1, 9};

        Arrays.sort(forSort);

        binaryNewSearch(forSort, 1);
        System.out.println(binaryNewSearch(forSort, 1) == 1);
        System.out.println(binaryNewSearch(forSort, 8) == 8);
        System.out.println(binaryNewSearch(forSort, 5) == 5);

    }

    private static int binaryNewSearch(int[] forSort, int searchNum) {
        int midIndex = forSort.length / 2;
        int result = -1;
        if (forSort[midIndex] == searchNum) {

            result = midIndex;
        } else if (searchNum > forSort[midIndex]) {
            int[] tempArray = new int[forSort.length - midIndex];
            System.arraycopy(forSort, midIndex, tempArray, 0, forSort.length - midIndex);
            result = midIndex + binaryNewSearch(tempArray, searchNum);
        } else {
            int[] tempArray = new int[forSort.length - midIndex];
            System.arraycopy(forSort, 0, tempArray, 0, forSort.length - midIndex);
           result = binaryNewSearch(tempArray, searchNum);
        }
        return result;
    }
}
