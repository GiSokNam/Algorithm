import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[30];
        int a;
        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken()) - 1;
            arr[a] = 1;
        }
        br.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                bw.write(i+1+"");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}