import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());
        Long time = n * n * n;
        br.close();
        bw.write(time + "");
        bw.newLine();
        bw.write(3 + "");
        bw.flush();
        bw.close();
    }
}