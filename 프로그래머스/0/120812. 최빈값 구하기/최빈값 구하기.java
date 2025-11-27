class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];

        for (int n : array) count[n]++;

        int max = 0, mode = -1;
        for (int i = 0; i < 1000; i++) {
            if (count[i] > max) {
                max = count[i];
                mode = i;
            } else if (count[i] == max && max != 0) {
                mode = -1;
            }
        }
        return mode;
    }
}