import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b/100;
        int d = (b - (c*100))/10;
        int e = b-((c*100)+(d*10));
        int aa = a*e;
        int bb = a*d;
        int cc = a*c;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.print((cc*100)+(bb*10)+aa);
    }
}