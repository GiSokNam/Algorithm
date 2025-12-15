class Solution {
    public int solution(int n, int w, int num) {
        int idx = num - 1;
        int row = idx / w;
        int pos = idx % w;

        int col = (row % 2 == 0) ? pos : w - 1 - pos;

        int count = 1;

        for (int r = row + 1; r * w < n; r++) {
            int base = r * w;
            int targetPos = (r % 2 == 0) ? col : w - 1 - col;
            if (base + targetPos < n) {
                count++;
            }
        }
        return count;
    }
}