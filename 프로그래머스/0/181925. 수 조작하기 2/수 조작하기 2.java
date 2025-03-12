class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            
            result.append(diff == 1 ? "w" : 
                          diff == -1 ? "s" : 
                          diff == 10 ? "d" : "a");
        }
        
        return result.toString();
    }
}