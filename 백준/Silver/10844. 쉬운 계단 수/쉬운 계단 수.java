import java.io.*;

public class Main {

    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

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

        sb.append(finalResult);
        System.out.print(sb);
    }

    static long circulate(int digit, int val) {
        if (digit == 1) {
            return dp[digit][val];
        }

        if(dp[digit][val] == null) {
            // val이 0일경우 이전 자리는 1밖에 못옴
            if(val == 0) {
                dp[digit][val] = circulate(digit - 1 ,1);
            }
            // val이 1일경우 이전은 8밖에 못옴
            else if(val== 9) {
                dp[digit][val] = circulate(digit - 1, 8);
            }
            // 그 외의 경우는 val-1과 val+1 값의 경우의 수를 합한 경우의 수가 됨
            else {
                dp[digit][val] = circulate(digit - 1, val - 1) + circulate(digit - 1, val + 1);
            }
        }
        return dp[digit][val] % MOD;
    }
}