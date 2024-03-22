import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        br.close();
        
        if (N == 1) {
            bw.write(count+"");
        } else {
            while (range <= N) {
                range += 6 * count;
                count++;
            }
            bw.write(count+"");
        }
        bw.flush();
        bw.close();
    }
}