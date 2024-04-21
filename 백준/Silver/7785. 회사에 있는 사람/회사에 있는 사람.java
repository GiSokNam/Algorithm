import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> input = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();
            if (input.containsKey(name)) {
                input.remove(name);
            } else {
                input.put(name, state);
            }
        }
        br.close();

        ArrayList<String> list = new ArrayList<String>(input.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}