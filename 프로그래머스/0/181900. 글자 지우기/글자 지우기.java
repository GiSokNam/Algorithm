import java.util.HashSet;
import java.util.Set;

class Solution {

    public String solution(String myString, int[] indices) {

        Set<Integer> removeIndexSet = new HashSet<>();
        for (int index : indices) {
            removeIndexSet.add(index);
        }

        StringBuilder result = new StringBuilder(myString.length() - indices.length);

        for (int i = 0; i < myString.length(); i++) {
            if (!removeIndexSet.contains(i)) {
                result.append(myString.charAt(i));
            }
        }

        return result.toString();
    }
}