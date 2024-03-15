import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        String[] S = new String[T];
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = st.nextToken();
        }
        br.close();
        for (String string : S) {
            bw.write(string.charAt(0) +""+string.charAt(string.length()-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}