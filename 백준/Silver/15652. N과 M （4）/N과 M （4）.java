import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static int N, M;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int at, int depth) throws IOException {

        if (depth == M) {
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i,depth + 1);
        }
    }

}