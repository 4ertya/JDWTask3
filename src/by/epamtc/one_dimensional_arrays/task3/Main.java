package by.epamtc.one_dimensional_arrays.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CodeLock codeLock=new CodeLock();
        int[] result;
        result=codeLock.getRightCombination();
        System.out.println(Arrays.toString(result));
    }
}
