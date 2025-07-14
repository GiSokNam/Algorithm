class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length, c = arr[0].length, max = Math.max(r, c);
        int[][] result = new int[max][max];
        for (int i = 0; i < r; i++)
            System.arraycopy(arr[i], 0, result[i], 0, c);
        return result;
    }
}