class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < code.length(); index++) {
            if (index % q == r) {
                result.append(code.charAt(index));
            }
        }

        return result.toString();
    }
}