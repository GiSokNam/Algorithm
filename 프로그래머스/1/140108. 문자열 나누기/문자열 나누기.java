class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int otherCount = 0;
        char x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (xCount == 0) {
                x = c;
                xCount = 1;
            } else if (c == x) {
                xCount++;
            } else {
                otherCount++;
            }

            if (xCount == otherCount) {
                answer++;
                xCount = 0;
                otherCount = 0;
            }
        }

        if (xCount != 0) {
            answer++;
        }

        return answer;
    }
}