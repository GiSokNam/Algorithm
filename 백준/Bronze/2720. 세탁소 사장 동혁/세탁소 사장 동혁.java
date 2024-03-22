import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;
        int T = Integer.parseInt(br.readLine());
        int C;
        int quotient = 0;
        int remainder = 0;
        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            if (C / Q >= 0) {
                quotient = C / Q;
                remainder = C % Q;
                bw.write(quotient + " ");
            }
            if (remainder / D >= 0) {
                quotient = remainder / D;
                remainder %= D;
                bw.write(quotient + " ");
            }
            if (remainder / N >= 0) {
                quotient = remainder / N;
                remainder %= N;
                bw.write(quotient + " ");
            }
            if (remainder / P >= 0) {
                quotient = remainder / P;
                remainder %= P;
                bw.write(quotient + " ");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}