import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int gcd = 0;
        int distance;
        for (int i = 0; i < N - 1; i++) {
            distance = tree[i + 1] - tree[i];
            gcd = GCD(distance, gcd);
        }

        int result = (tree[N-1] - tree[0])/gcd + 1 - tree.length;
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}