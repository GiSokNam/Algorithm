import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                bw.write(i + "");
                bw.newLine();
                N /= i;
            }
        }
        if (N != 1) {
            bw.write(N +"");
        }
        bw.flush();
        bw.close();
    }
}