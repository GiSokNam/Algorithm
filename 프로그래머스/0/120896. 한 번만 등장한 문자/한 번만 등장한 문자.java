import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (freqMap.get(c) == 1) {
                uniqueChars.add(c);
            }
        }
        
        Collections.sort(uniqueChars);
        
        StringBuilder sb = new StringBuilder();
        for (char c : uniqueChars) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}