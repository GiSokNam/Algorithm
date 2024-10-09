import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long gcd = GCD(A, B);
        long result = A * B / gcd;
        br.close();
        sb.append(result);
        System.out.print(sb);
    }

    public static long GCD(long a, long b) {
        long r = a % b;
        if (r == 0) {
            return b;
        } else {
            return GCD(b, a % b);
        }
    }
}