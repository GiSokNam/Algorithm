import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        int xMin = a[0];
        int xMax = a[0];
        int yMin = b[0];
        int yMax = b[0];

        if (n == 1) {
            bw.write(0 + "");
        } else {

            for (int i = 0; i < n; i++) {
                if (xMin > a[i]) {
                    xMin = a[i];
                }
                if (xMax < a[i]) {
                    xMax = a[i];
                }

                if (yMin > b[i]) {
                    yMin = b[i];
                }
                if (yMax < b[i]) {
                    yMax = b[i];
                }
            }

            int w = xMax - xMin;
            int h = yMax - yMin;

            bw.write(w*h+"");
        }
        bw.flush();
        bw.close();
    }
}