import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        br.close();
        ArrayList<Character> list = new ArrayList<>();
        char c;
        while (N > 0) {
            if (N % B < 10) {
                c = (char) (N % B + '0');
                list.add(c);
            } else {
                c = (char) (N % B + 55);
                list.add(c);
            }
            N /= B;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i)+"");
        }
        bw.flush();
        bw.close();

    }
}