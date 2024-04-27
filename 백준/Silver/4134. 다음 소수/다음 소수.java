import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(br.readLine());
            BigInteger num = new BigInteger(String.valueOf(value));

            if (num.isProbablePrime(10)) {
                bw.write(num + "");
                bw.newLine();
            } else {
                bw.write(num.nextProbablePrime() + "");
                bw.newLine();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}