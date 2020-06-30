package by.epamtc.one_dimensional_arrays.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array=new Array();
        int[] resultArray;
        resultArray=array.getArrayWithoutMin();
        System.out.println(Arrays.toString(resultArray));
    }
}
