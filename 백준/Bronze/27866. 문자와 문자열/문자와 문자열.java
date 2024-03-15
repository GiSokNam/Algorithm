import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine()) -1;
        br.close();
        char c = S.charAt(i);
        bw.write(c);
        bw.flush();
        bw.close();
    }
}