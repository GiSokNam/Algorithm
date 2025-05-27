import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        return Arrays.stream(parts)
                     .mapToInt(String::length)
                     .toArray();
    }
}