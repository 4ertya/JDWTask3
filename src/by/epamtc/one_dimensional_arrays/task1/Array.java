package by.epamtc.one_dimensional_arrays.task1;

public class Array {

    private final double[] DATA = {2, 1, 3, 2, 4, 5, 9, 1};
    private int indexOfFirst;
    private int indexOfSecond;

    public double findMaxPairSum() {

        double maxSum = DATA[0] + DATA[DATA.length - 1];
        double temp;

        for (int i = 0; i < DATA.length / 2; i++) {
            temp = DATA[i] + DATA[DATA.length - 1 - i];
            if (temp > maxSum) {
                maxSum = temp;
                indexOfFirst = i;
                indexOfSecond = DATA.length - 1 - i;
            }
        }
        return maxSum;
    }

    public void printResult() {
        System.out.println(findMaxPairSum() + " = DATA[" + indexOfFirst + "] + DATA[" + indexOfSecond + "]");
    }
}
