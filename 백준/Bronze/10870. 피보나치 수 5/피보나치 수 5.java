import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 0; i < N; i++) {
            list.add(list.get(i) + list.get(i + 1));
        }

        br.close();
        System.out.print(list.get(N));
    }
}