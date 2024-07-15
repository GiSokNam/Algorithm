import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String bomb = br.readLine();
        int bombSize = bomb.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if (stack.size() >= bombSize) {
                boolean flag = true;

                for (int j = 0; j < bombSize; j++) {
                    if (stack.get(stack.size() - bombSize + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int j = 0; j < bombSize; j++) {
                        stack.pop();
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            bw.write("FRULA");
            bw.newLine();
        } else {
            for (Character c : stack) {
                bw.write(c + "");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}