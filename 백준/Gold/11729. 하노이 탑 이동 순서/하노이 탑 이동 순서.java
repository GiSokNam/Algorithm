import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = (int) Math.pow(2, N) - 1;
        bw.write(cnt + "");
        bw.newLine();
        move(N, 1, 3, 2);
        br.close();
        bw.flush();
        bw.close();
    }

    static void move(int N, int from, int to, int temp) throws IOException {
        if (N == 1) {
            bw.write(from + " " + to + "\n");
        } else {
            move(N - 1, from, temp, to);
            bw.write(from + " " + to + "\n");
            move(N - 1, temp, to, from);
        }
    }

}