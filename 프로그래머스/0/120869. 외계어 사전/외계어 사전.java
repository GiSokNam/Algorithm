import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> s = new HashSet<>(Arrays.asList(spell));
        for (String w : dic)
            if (s.equals(new HashSet<>(Arrays.asList(w.split("")))))
                return 1;
        return 2;
    }
}