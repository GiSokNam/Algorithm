import java.util.regex.*;

public class Solution {
    public int solution(String my_string) {
        Matcher m = Pattern.compile("\\d+").matcher(my_string);
        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        return sum;
    }
}