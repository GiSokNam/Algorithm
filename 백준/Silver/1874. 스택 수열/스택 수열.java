import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sbf = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();

        int num = 1;
        boolean result = true;

        for (int i = 0; i < A.length; i++) {
            int su = A[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sbf.append("+\n");
                }
                stack.pop();
                sbf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sbf.append("-\n");
                }
            }
        }

        if (result) {
            System.out.println(sbf);
        }
        br.close();
    }
}