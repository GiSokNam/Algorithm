class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int count = 0;
            char next = c;

            while (count < index) {
                next = (char) ((next - 'a' + 1) % 26 + 'a');
                if (!skip.contains(String.valueOf(next))) {
                    count++;
                }
            }
            result.append(next);
        }
        return result.toString();
    }
}