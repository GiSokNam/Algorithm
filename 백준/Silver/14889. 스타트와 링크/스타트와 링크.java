import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static boolean[] check;
    static int[][] board;
    static StringTokenizer st;
    static int MIN_RESULT = Integer.MAX_VALUE;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        check = new boolean[N + 1];
        board = new int[N + 1][N + 1];


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 1);
        br.close();
        sb.append(MIN_RESULT);
        System.out.print(sb);

    }

    public static void solution(int dep, int start) {
        if(dep == N/2) {
            MIN_RESULT = Math.min(MIN_RESULT, getResult());
            return;
        }

        for(int i=start; i<=N; i++) {

            check[i] = true;
            solution(dep+1, i+1);
            check[i] = false;
        }
    }

    static int getResult() {
        int start = 0;
        int link = 0;

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(i == j) continue;

                if(check[i] && check[j]) start += board[i][j];
                if(!check[i] && !check[j]) link += board[i][j];
            }
        }
        return Math.abs(start - link);
    }

}