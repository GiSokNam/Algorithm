import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        String a = st.nextToken();
        String b = st.nextToken();
        String c = "";
        String d = "";
        for (int i = 2; i >= 0; i--) {
            c += String.valueOf(a.charAt(i));
            d += String.valueOf(b.charAt(i));
        }
        if (Integer.parseInt(c) > Integer.parseInt(d)) {
            bw.write(c + "");
        } else {
            bw.write(d +"");
        }
        bw.flush();
        bw.close();
    }
}