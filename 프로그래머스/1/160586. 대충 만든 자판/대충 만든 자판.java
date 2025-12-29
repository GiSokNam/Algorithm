import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] min = new int[26];
        Arrays.fill(min, Integer.MAX_VALUE);

        for (String key : keymap)
            for (int i = 0; i < key.length(); i++)
                min[key.charAt(i) - 'A'] = Math.min(min[key.charAt(i) - 'A'], i + 1);

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (char c : targets[i].toCharArray()) {
                if (min[c - 'A'] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += min[c - 'A'];
            }
            answer[i] = sum;
        }
        return answer;
    }
}