class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        

        int verticalLength = my_string.length() / m;
        
        for (int i = 0; i < verticalLength; i++) {
            answer.append(my_string.charAt(c - 1 + i * m));
        }
        
        return answer.toString();
    }
}