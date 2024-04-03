import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[10001];
        
        for (int i = 0; i < N; i++) {
            x[Integer.parseInt(br.readLine())] ++;
        }
        br.close();

        for (int i = 1; i < 10001; i++) {
            while (x[i] > 0) {
                bw.write(i + "");
                bw.newLine();
                x[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}