class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int count = 0;

        for (int i = 0; i < schedules.length; i++) {
            int limit = schedules[i] + 10;
            if (limit % 100 >= 60) limit += 40;

            boolean ok = true;
            for (int d = 0; d < 7; d++) {
                int day = (startday + d - 1) % 7 + 1;
                if (day <= 5 && timelogs[i][d] > limit) {
                    ok = false;
                    break;
                }
            }
            if (ok) count++;
        }
        return count;
    }
}