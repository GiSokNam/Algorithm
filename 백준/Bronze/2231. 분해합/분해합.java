import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        br.close();

        String temp;
        int numTemp = Integer.parseInt(N);
        int minConstructor = 0;
        while (true) {
            numTemp--;
            if (numTemp == 0) {
                break;
            }
            temp = String.valueOf(numTemp);
            int a = 0;
            for (int i = 0; i < temp.length(); i++) {
                a += Integer.parseInt(String.valueOf(temp.charAt(i)));
            }
            
            if (Integer.parseInt(N) == Integer.parseInt(temp)+a) {
                minConstructor = Integer.parseInt(temp);
            }
        }
        sb.append(minConstructor);
        System.out.print(sb);
    }
}