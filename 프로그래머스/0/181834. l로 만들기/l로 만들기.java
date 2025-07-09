class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> (char) c < 'l' ? "l" : String.valueOf((char) c))
                .collect(java.util.stream.Collectors.joining());
    }
}