class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long target = Long.parseLong(p);
        int count = 0;

        for (int i = 0; i <= t.length() - len; i++) {
            if (Long.parseLong(t.substring(i, i + len)) <= target) {
                count++;
            }
        }
        return count;
    }
}