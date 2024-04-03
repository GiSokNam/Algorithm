import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] desc = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            desc[i] = Integer.parseInt(br.readLine());
            sum += desc[i];
        }
        br.close();

        int avg = sum / 5;
        Arrays.sort(desc);

        bw.write(avg+"");
        bw.newLine();
        bw.write(desc[2]+"");
        bw.flush();
        bw.close();
    }
}