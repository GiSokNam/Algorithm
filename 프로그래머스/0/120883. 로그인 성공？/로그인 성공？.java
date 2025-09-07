import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        return Arrays.stream(db)
            .filter(u -> u[0].equals(id_pw[0]))
            .findFirst()
            .map(u -> u[1].equals(id_pw[1]) ? "login" : "wrong pw")
            .orElse("fail");
    }
}