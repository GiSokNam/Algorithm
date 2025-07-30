import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz)
            .map(q -> {
                String[] s = q.split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[2]);
                int z = Integer.parseInt(s[4]);
                int result = s[1].equals("+") ? x + y : x - y;
                return result == z ? "O" : "X";
            })
            .toArray(String[]::new);
    }
}