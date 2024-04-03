import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            bw.write(checkVPS(br.readLine()));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static String checkVPS(String str) {
        Stack<Character> stack = new Stack<>();
        char check;
        for (int i = 0; i < str.length(); i++) {
            check = str.charAt(i);

            if('(' == check) stack.push(check);
            else if(stack.empty()) return "NO";
            else stack.pop();
        }

        if(stack.empty()) return "YES";
        else return "NO";
    }
}