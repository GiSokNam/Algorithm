import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = (int) Math.pow(2, N) - 1;
        sb.append(cnt + "\n");
        move(N, 1, 3, 2);
        br.close();
        System.out.print(sb);
    }

    static void move(int N, int from, int to, int temp) throws IOException {
        if (N == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            move(N - 1, from, temp, to);
            sb.append(from + " " + to + "\n");
            move(N - 1, temp, to, from);
        }
    }

}