import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            index.put(friends[i], i);
        }

        int[][] give = new int[n][n];
        int[] score = new int[n];

        for (String g : gifts) {
            String[] s = g.split(" ");
            int from = index.get(s[0]);
            int to = index.get(s[1]);
            give[from][to]++;
            score[from]++;
            score[to]--;
        }

        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) next[i]++;
                else if (give[i][j] < give[j][i]) next[j]++;
                else {
                    if (score[i] > score[j]) next[i]++;
                    else if (score[i] < score[j]) next[j]++;
                }
            }
        }

        return Arrays.stream(next).max().orElse(0);
    }
}