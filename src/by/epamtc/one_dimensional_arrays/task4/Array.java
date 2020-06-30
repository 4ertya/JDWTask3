package by.epamtc.one_dimensional_arrays.task4;

import java.util.Arrays;

public class Array {
    private int[] data = {3, 2, 5, 6, 1, 2, 9, 12, 4, 1, 3, 5, 4, 3, 2, 5};
    private int[] mostCommonNumbers;

    public int findMostCommon() {

        int resultCount = 0;
        for (int number : data) {
            int count = 0;
            for (int value : data) {
                if (number == value) {
                    count++;
                }
            }
            if (count > resultCount) {
                mostCommonNumbers = new int[]{number};
                resultCount = count;
            } else if (count == resultCount) {
                mostCommonNumbers = Arrays.copyOf(mostCommonNumbers, mostCommonNumbers.length + 1);
                mostCommonNumbers[mostCommonNumbers.length - 1] = number;
            }
        }

        return findMinMostCommon();
    }

    private int findMinMostCommon() {
        if (mostCommonNumbers.length == 1) {
            return mostCommonNumbers[0];
        } else {
            int min = mostCommonNumbers[0];
            for (int number : mostCommonNumbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }

    }


}
