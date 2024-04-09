import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                flag = true;
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(ch);
            } else if (ch == '>') {
                flag = false;
                bw.write(ch);
            } else if (ch == ' ') {
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(ch);
            } else {
                if(flag) bw.write(ch);
                else stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            bw.write(stack.pop());
        }
        bw.flush();
        bw.close();
    }
}