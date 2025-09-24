class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0, xmax = board[0] / 2, ymax = board[1] / 2;
        for (String k : keyinput) {
            int nx = x, ny = y;
            switch (k) {
                case "left"  -> nx--;
                case "right" -> nx++;
                case "up"    -> ny++;
                case "down"  -> ny--;
            }
            if (Math.abs(nx) <= xmax && Math.abs(ny) <= ymax) { x = nx; y = ny; }
        }
        return new int[]{x, y};
    }
}