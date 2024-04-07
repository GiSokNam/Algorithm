import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A;
        int B;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            if(!st.hasMoreTokens()) break;
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write((A+B)+"");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}