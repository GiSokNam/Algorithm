import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N + 1];
            dp[0] = 0;
            dp[1] = 1;

            if (N > 1) {
                dp[2] = 1;
                for (int j = 3; j <= N; j++) {
                    dp[j] = dp[j - 3] + dp[j - 2];
                }
            }

            sb.append(dp[N] + "\n");
        }
        br.close();
        System.out.print(sb);
    }
}