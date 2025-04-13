class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        boolean[] toRemove = new boolean[my_string.length()]; 
        
        for (int idx : indices) {
            toRemove[idx] = true;
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!toRemove[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}