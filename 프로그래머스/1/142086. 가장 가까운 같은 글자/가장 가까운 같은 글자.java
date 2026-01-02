import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);

        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            result[i] = lastIndex[idx] == -1 ? -1 : i - lastIndex[idx];
            lastIndex[idx] = i;
        }

        return result;
    }
}