import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int I = Integer.parseInt(br.readLine());
        char[] c = S.toCharArray();

        StringTokenizer st;
        for (int i = 0; i < I; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String searchStr = st.nextToken();
            int rangeMin = Integer.parseInt(st.nextToken());
            int rangeMax = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for (int j = rangeMin; j <= rangeMax; j++) {
                String comparisonStr = String.valueOf(c[j]);
                if (searchStr.equals(comparisonStr)) {
                    cnt++;
                }
            }
            bw.write(cnt + "");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}