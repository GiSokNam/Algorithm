import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> stackA = new Stack<>();
        Stack<String> stackB = new Stack<>();

        String[] arr = str.split("");
        for (String s : arr) {
            stackA.push(s);
        }

        StringTokenizer st;
        String A;
        String B;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A = st.nextToken();

            switch (A) {
                case "L" :
                    if(!stackA.isEmpty()) stackB.push(stackA.pop());
                    break;
                case "D" :
                    if(!stackB.isEmpty()) stackA.push(stackB.pop());
                    break;
                case "B" :
                    if(!stackA.isEmpty()) stackA.pop();
                    break;
                case "P" :
                    B = st.nextToken();
                    stackA.push(B);
                    break;
                default:
                    break;
            }
        }
        br.close();

        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }

        while (!stackB.isEmpty()) {
            bw.write(stackB.pop());
        }

        bw.flush();
        bw.close();
    }
}