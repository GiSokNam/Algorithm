class Solution {
    public int solution(String myString, String pat) {
        String flipped = myString.replace('A', 'x')
                                 .replace('B', 'A')
                                 .replace('x', 'B');
        return flipped.contains(pat) ? 1 : 0;
    }
}