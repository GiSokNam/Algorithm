class Solution {
    public int solution(String s) {
        String[] a = s.split(" ");
        int r = Integer.parseInt(a[0]);
        for (int i = 1; i < a.length; i += 2)
            r += a[i].charAt(0) == '+' ? Integer.parseInt(a[i+1]) : -Integer.parseInt(a[i+1]);
        return r;
    }
}