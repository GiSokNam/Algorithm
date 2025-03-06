class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddSum = "";
        String evenSum = "";
        
        for (int i : num_list) {
            String dummy = (i % 2 == 0) ? (evenSum += i) : (oddSum += i);
        }
        
        answer = Integer.parseInt(oddSum) + Integer.parseInt(evenSum);
        
        return answer;
    }
}