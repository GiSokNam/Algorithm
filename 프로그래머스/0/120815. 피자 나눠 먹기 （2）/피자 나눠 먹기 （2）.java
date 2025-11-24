public class Solution {
    public int solution(int n) {
        int p = 1;
        while ((6 * p) % n != 0) p++;
        return p;
    }
}