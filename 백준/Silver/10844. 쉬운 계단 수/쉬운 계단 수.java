import java.io.*;

public class Main {

    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        br.close();
        dp = new Long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += circulate(N, i);
        }

        long finalResult = result % MOD;

        bw.write(finalResult + "");
        bw.flush();
        bw.close();
    }

    static long circulate(int digit, int val) {
        if (digit == 1) {
            return dp[digit][val];
        }

        if(dp[digit][val] == null) {
            if(val == 0) {
                dp[digit][val] = circulate(digit - 1 ,1);
            } else if(val== 9) {
                dp[digit][val] = circulate(digit - 1, 8);
            } else {
                dp[digit][val] = circulate(digit - 1, val - 1) + circulate(digit - 1, val + 1);
            }
        }
        return dp[digit][val] % MOD;
    }
}