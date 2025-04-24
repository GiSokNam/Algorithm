import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> answerList = new ArrayList<>();
        int indexOfL = -1;
        int indexOfR = -1;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                indexOfL = i;
                break;
            } else if (str_list[i].equals("r")) {
                indexOfR = i;
                break;
            }
        }
        
        if (indexOfL != -1 && (indexOfR == -1 || indexOfL < indexOfR)) {
            for (int i = 0; i < indexOfL; i++) {
                answerList.add(str_list[i]);
            }
        } else if (indexOfR != -1 && (indexOfL == -1 || indexOfR < indexOfL)) {
            for (int i = indexOfR + 1; i < str_list.length; i++) {
                answerList.add(str_list[i]);
            }
        }
        
        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        
        return answer;
    }
}
