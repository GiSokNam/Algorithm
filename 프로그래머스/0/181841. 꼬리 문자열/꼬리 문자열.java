import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static String solution(String[] strList, String ex) {
        return Arrays.stream(strList)
                     .filter(s -> !s.contains(ex))
                     .collect(Collectors.joining());
    }
}