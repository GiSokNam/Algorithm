import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chessBoard = new String[N];
        for (int i = 0; i < N; i++) {
            chessBoard[i] = br.readLine();
        }

        int sol = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int curSol = getSolution(i, j, chessBoard);
                if (sol > curSol) {
                    sol = curSol;
                }
            }
        }
        br.close();
        bw.write(sol + "");
        bw.flush();
        bw.close();
    }

    private static int getSolution(int startRow, int startCol, String[] chessBoard) {

        String[] oriBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;
        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (chessBoard[row].charAt(col) != oriBoard[row % 2].charAt(j)) {
                    whiteSol++;
                }
            }
        }
        return Math.min(whiteSol, 64 - whiteSol);
    }
}