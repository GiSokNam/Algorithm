class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        int x = 0, y = 0, dir = 0, val = 1;

        while (val <= n * n) {
            arr[x][y] = val++;
            int nx = x + dx[dir], ny = y + dy[dir];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0)
                dir = (dir + 1) % 4;
            x += dx[dir];
            y += dy[dir];
        }

        return arr;
    }
}