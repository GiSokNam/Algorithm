import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());
        Long time = (n * (n - 1)) / 2;
        br.close();
        bw.write(time + "");
        bw.newLine();
        bw.write(2 + "");
        bw.flush();
        bw.close();
    }
}