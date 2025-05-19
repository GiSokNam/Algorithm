class Solution {
    public String solution(String myString) {
        return myString
                .replace("a", "A")
                .chars()
                .mapToObj(c -> c != 'A' && Character.isUpperCase(c)
                        ? String.valueOf((char) Character.toLowerCase(c))
                        : String.valueOf((char) c))
                .collect(java.util.stream.Collectors.joining());
    }
}