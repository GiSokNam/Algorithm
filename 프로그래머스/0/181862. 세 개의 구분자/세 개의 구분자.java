import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public String[] solution(String myStr) {
        String[] tokens = Pattern.compile("[abc]+")
                .splitAsStream(myStr)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        return tokens.length == 0 ? new String[]{"EMPTY"} : tokens;
    }
}