class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        char mode = '0';
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = mode == '0' ? '1' : '0';
                continue;
            }
            if(mode == '0') {
                if(i % 2 == 0) {
                    answer.append(code.charAt(i));
                }
            } else {
                if(i % 2 != 0) {
                    answer.append(code.charAt(i));
                }
            }
        }
        
        if(answer.toString().isEmpty()) answer.append("EMPTY");
        
        return answer.toString();
    }
}