import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        int spot = (int) Math.pow(Math.pow(2, N) + 1, 2);
        bw.write(spot + "");
        bw.flush();
        bw.close();
    }
}