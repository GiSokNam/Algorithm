import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        long A2 = Long.parseLong(st.nextToken());
        long B2 = Long.parseLong(st.nextToken());

        A = (A * B2) + (A2 * B);
        B = B * B2;

        long gcd = GCD(A, B);
        long numerator = A / gcd;
        long denominator = B / gcd;

        br.close();
        bw.write( numerator + " " + denominator);
        bw.flush();
        bw.close();
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