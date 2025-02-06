import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        char b;
        
        for(int i = 0; i < a.length(); i++) {
            b = a.charAt(i);
            
            if(Character.isUpperCase(b)) {
                sb.append(Character.toLowerCase(b));
            } else {
                sb.append(Character.toUpperCase(b));
            }
        }
        
        System.out.print(sb.toString());
        
    }
}