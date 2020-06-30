package by.epamtc.one_dimensional_arrays.task3;

public class CodeLock {
    int firstKnownIndex;
    int secondKnownIndex;
    private int[] code = {0, 4, 0, 0, 0, 1, 0, 0, 0, 0};

    {
        knownIndexes();
    }

    public boolean isPossible() {

//        if (firstKnownIndex == (secondKnownIndex % 3)) {
//            return false;
//        }

        for (int i = 0; i < code.length - 2; i++) {
            if (code[i] + code[i + 1] + code[i + 2] >= 9) {
                return false;
            }
        }

        return true;
    }

    private void knownIndexes() {

        for (int i = 0; i < code.length; i++) {
            if (code[i] != 0 && firstKnownIndex == 0) {
                firstKnownIndex = i;
            } else if (code[i] != 0) {
                secondKnownIndex = i;
            }
        }
    }

    public int[] getRightCombination() {

        if (!isPossible()) {
            return null;
        }

        for (int i = 0; i < 3; i++) {
            if (code[i] == 0 && firstKnownIndex % 3 == i) {
                code[i] = code[firstKnownIndex];
            } else if (code[i] == 0 && secondKnownIndex % 3 == i) {
                code[i] = code[secondKnownIndex];
            } else if (code[i] == 0) {
                code[i] = 10 - code[firstKnownIndex] - code[secondKnownIndex];
            }
        }

        for (int i = 3; i < code.length; i++) {
            if (code[i] == 0) {
                code[i] = 10 - code[i - 1] - code[i - 2];
            }
        }

        return code;
    }
}


