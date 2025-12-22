import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> indexMap = new HashMap<>(players.length);

        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = indexMap.get(calling);
            String front = players[idx - 1];

            players[idx - 1] = calling;
            players[idx] = front;

            indexMap.put(calling, idx - 1);
            indexMap.put(front, idx);
        }

        return players;
    }
}