import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder(); 

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        br.close();
        System.out.print(sb);
    }

    public static void dfs(int at, int depth) throws IOException {

        if (depth == M) {
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i,depth + 1);
        }
    }

}