import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        String[] result = Arrays.stream(parts)
                                .filter(s -> !s.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return result;
    }
}