import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        Long[] N = new Long[n.length()];
        br.close();
        for (int i = 0; i < n.length(); i++) {
            N[i] = Long.parseLong(String.valueOf(n.charAt(i)));
        }
        Arrays.sort(N);
        String temp ="";
        for (int i = 0; i < N.length; i++) {
            temp += String.valueOf(N[i]);
        }
        sb.append(temp);
        System.out.print(sb.reverse());
    }
}