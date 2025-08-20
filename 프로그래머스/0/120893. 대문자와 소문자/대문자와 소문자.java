class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> Character.isUpperCase(c) 
                        ? String.valueOf((char) Character.toLowerCase(c))
                        : String.valueOf((char) Character.toUpperCase(c)))
                .reduce("", String::concat);
    }
}