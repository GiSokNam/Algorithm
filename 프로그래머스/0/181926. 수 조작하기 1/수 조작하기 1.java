class Solution {
    public int solution(int n, String control) {
        char[] arr = control.toCharArray();

        for (char str : arr) {
            n += (str == 'w') ? 1 : (str == 's') ? -1 : (str == 'd') ? 10 : (str == 'a') ? -10 : 0;
        }

        return n;
    }
}