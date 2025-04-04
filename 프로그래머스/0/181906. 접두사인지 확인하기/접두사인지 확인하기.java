class Solution {
    public int solution(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }
        
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}