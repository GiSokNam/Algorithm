import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[][] arr = new String[5][15];

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        br.close();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == null) continue;
                bw.write(arr[j][i] + "");
            }
        }
        bw.flush();
        bw.close();
    }
}