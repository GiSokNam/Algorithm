class Solution {
    public String solution(String my_string, int[][] queries) {
         var sb = new StringBuilder(my_string);

        for (var query : queries) {
            int s = query[0], e = query[1];
            sb.replace(s, e + 1, new StringBuilder(sb.substring(s, e + 1)).reverse().toString());
        }

        return sb.toString();
    }
}