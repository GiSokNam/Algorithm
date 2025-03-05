class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sumOfPow = 0;
        for(int num : num_list) {
            multiply *= num;
            sumOfPow += num;
        }
        
        return multiply < Math.pow(sumOfPow,2) ? 1 : 0;
    }
}