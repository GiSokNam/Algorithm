import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < N; i++) {
            circulate(i);
        }

        int max = dp[0];

        for (int i = 1; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static int circulate(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (arr[i] < arr[N]) {
                    dp[N] = Math.max(dp[N], circulate(i) + 1);
                }
            }

        }
        return dp[N];
    }
}