import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) System.out.println("*".repeat(i));
        }
    }
}