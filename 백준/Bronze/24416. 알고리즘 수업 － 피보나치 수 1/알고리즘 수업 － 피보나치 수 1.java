import java.io.*;

public class Main {
    static int code1Cnt, code2Cnt;
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        f = new int[n];
        code1Cnt = 0;
        code2Cnt = 0;

        br.close();
        fib(n);
        fibonacci(n);
        sb.append(code1Cnt + " " + code2Cnt);
        System.out.print(sb);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            code1Cnt++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            code2Cnt++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }
}