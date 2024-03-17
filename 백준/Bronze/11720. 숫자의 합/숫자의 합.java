import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        br.close();
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        bw.write(sum +"");
        bw.flush();
        bw.close();
    }
}