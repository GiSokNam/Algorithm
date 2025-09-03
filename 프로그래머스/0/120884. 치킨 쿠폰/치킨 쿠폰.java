class Solution {
    public int solution(int chicken) {
        int result = 0;
        while (chicken >= 10) {
            int service = chicken / 10;
            result += service;
            chicken = service + (chicken % 10);
        }
        return result;
    }
}