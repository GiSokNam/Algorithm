import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        int[] ans = new int[N];
        int[] cnt = new int[1000001];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 0; i < N; i++) {
            cnt[num[i]]++;
        }

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && cnt[stack.peek()] <= cnt[num[i]]) {
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] = -1;
            else ans[i] = stack.peek();

            stack.push(num[i]);
        }

        for (int a : ans) {
            bw.write(a + " ");
        }

        bw.flush();
        bw.close();
    }
}