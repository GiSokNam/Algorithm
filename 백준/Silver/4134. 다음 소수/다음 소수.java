import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(br.readLine());
            BigInteger num = new BigInteger(String.valueOf(value));

            if (num.isProbablePrime(10)) {
                sb.append(num + "\n");
            } else {
                sb.append(num.nextProbablePrime() + "\n");
            }
        }
        br.close();
        System.out.print(sb);
    }
}