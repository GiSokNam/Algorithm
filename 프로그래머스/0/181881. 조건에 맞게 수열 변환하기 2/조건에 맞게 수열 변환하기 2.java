class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while (true) {
            boolean changed = false;
            for (int i = 0; i < arr.length; i++) {
                int v = arr[i];
                if (v >= 50 && v % 2 == 0) arr[i] /= 2;
                else if (v < 50 && v % 2 == 1) arr[i] = v * 2 + 1;
                else continue;
                if (arr[i] != v) changed = true;
            }
            if (!changed) return count;
            count++;
        }
    }
}