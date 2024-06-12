import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] boardQueen;
    public static int N;
    public static int resultCnt;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        boardQueen = new int[N];
        backTracking(0);
        br.close();
        bw.write(resultCnt + "");
        bw.flush();
        bw.close();
    }

    static void backTracking(int queenCnt) {
        if (queenCnt == N) {
            resultCnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            boardQueen[queenCnt] = i;
            if (checkQueen(queenCnt)) {
                backTracking(queenCnt + 1);
            }
        }
    }

    static boolean checkQueen(int col) {
        for (int i = 0; i < col; i++) {
            if (boardQueen[col] == boardQueen[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(boardQueen[col] - boardQueen[i])) {
                return false;
            }
        }
        return true;
    }


}