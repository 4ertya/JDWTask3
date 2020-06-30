package by.epamtc.one_dimensional_arrays.task2;

public class Array {
    private final int[] SOURCE_ARRAY = {1, 12, -3, -2, 1, 7, 8, -3, 9, 0};


    private int findMin() {
        int min = SOURCE_ARRAY[0];
        for (int number : SOURCE_ARRAY) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private int getCountOfMin() {
        int count = 0;
        for (int number : SOURCE_ARRAY) {
            if (number == findMin()) {
                count++;
            }
        }
        return count;
    }

    public int[] getArrayWithoutMin() {
        int[] resultArray = new int[SOURCE_ARRAY.length - getCountOfMin()];
        int min = findMin();
        int index=0;
        for (int value : SOURCE_ARRAY) {
            if (value != min) {
                resultArray[index] = value;
                index++;
            }
        }
        return resultArray;
    }
}
