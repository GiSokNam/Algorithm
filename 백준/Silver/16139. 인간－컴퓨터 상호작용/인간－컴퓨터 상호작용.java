import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int I = Integer.parseInt(br.readLine());
        int[][] alpha = new int[S.length() + 1][26];

        for (int i = 1; i <= S.length(); i++) {
            int search = S.charAt(i - 1) - 'a';

            for (int j = 0; j < 26; j++) {
                int beforeCharValue = alpha[i - 1][j];
                alpha[i][j] = (j == search ? beforeCharValue + 1 : beforeCharValue);
            }
        }

        StringTokenizer st;
        for (int i = 0; i < I; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int find = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken()) + 1;
            int end = Integer.parseInt(st.nextToken()) + 1;

            int result = alpha[end][find] - alpha[start - 1][find];
            bw.write(result + "");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}