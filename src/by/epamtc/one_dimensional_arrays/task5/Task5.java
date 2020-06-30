package by.epamtc.one_dimensional_arrays.task5;

public class Task5 {
    private int[] array = {5, 8, 9, 3, 1, 8, 4, 3, 13, 7, 4, 3};

    public int sumMaxOddMinEven() {
        return findMaxEven() + findMinOdd();
    }

    private int findMaxEven() {
        int maxEven = array[1];
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] > maxEven) {
                maxEven = array[i];
            }
        }
        return maxEven;
    }

    private int findMinOdd() {
        int minOdd = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < minOdd) {
                minOdd = array[i];
            }
        }
        return minOdd;
    }
}
