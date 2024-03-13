import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int max = 0;
        int count = 0;
        int index = 0;

        for (int i : a) {
            count++;
            if (i > max) {
                max = i;
                index = count;
            }
        }
        bw.write(max+"");
        bw.newLine();
        bw.write(index + "");
        bw.flush();
        bw.close();
    }
}