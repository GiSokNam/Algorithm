import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String temp = new StringBuilder(str).reverse().toString();

        if (str.equals(temp)) System.out.print(1);
        else System.out.print(0);
    }
}