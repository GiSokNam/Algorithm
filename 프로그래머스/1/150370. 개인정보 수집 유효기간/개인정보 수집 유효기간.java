import java.util.*;

class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for (String t : terms) {
            String[] s = t.split(" ");
            termMap.put(s[0], Integer.parseInt(s[1]) * 28);
        }

        int todayValue = toDay(today);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            int collectedDay = toDay(p[0]);
            int expire = collectedDay + termMap.get(p[1]);

            if (expire <= todayValue) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private int toDay(String date) {
        String[] d = date.split("\\.");
        return Integer.parseInt(d[0]) * 12 * 28
             + Integer.parseInt(d[1]) * 28
             + Integer.parseInt(d[2]);
    }
}