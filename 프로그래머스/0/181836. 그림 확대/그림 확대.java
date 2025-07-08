import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        
        String[] enlargedPicture = new String[rows * k];
        
        for (int i = 0; i < rows * k; i++) {
            StringBuilder sb = new StringBuilder();
            int originalRow = i / k;
            
            for (int j = 0; j < cols; j++) {
                char pixel = picture[originalRow].charAt(j);
                sb.append(String.valueOf(pixel).repeat(k));
            }
            
            enlargedPicture[i] = sb.toString();
        }
        
        return enlargedPicture;
    }
}