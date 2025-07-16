class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for (String s : babbling) {
            String temp = s;
            for (String w : words) temp = temp.replace(w, " ");
            if (temp.isBlank()) count++;
        }
        return count;
    }
}