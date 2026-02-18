class Solution {
    public String solution(String myString, int s, int e) {
        char[] chars = myString.toCharArray();

        while (s < e) {
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            s++;
            e--;
        }

        return new String(chars);
    }
}