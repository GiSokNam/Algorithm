class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Input matrices must not be null.");
        }

        int rowLength = arr1.length;
        int columnLength = arr1[0].length;

        if (rowLength != arr2.length || columnLength != arr2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        int[][] result = new int[rowLength][columnLength];

        for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
                result[rowIndex][columnIndex] =
                        arr1[rowIndex][columnIndex] + arr2[rowIndex][columnIndex];
            }
        }

        return result;
    }
}