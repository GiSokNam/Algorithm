import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        int result = 1;
        for (int i = N; i > 0; i--) {
            result *= i;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}