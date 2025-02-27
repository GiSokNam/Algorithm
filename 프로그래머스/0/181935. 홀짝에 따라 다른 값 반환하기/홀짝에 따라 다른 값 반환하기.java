class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0) b += i*i;
            else a += i;
        }

        answer = n % 2 == 0 ? b : a;

        return answer;
    }
}