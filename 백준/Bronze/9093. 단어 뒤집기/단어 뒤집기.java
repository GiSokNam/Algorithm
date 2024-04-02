import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A[i] ="";

            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                A[i] += reverse(temp) + " ";
            }
            bw.write(A[i]);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

}