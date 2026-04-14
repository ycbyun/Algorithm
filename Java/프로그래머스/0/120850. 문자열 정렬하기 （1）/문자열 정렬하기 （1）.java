import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numStr = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = new int[numStr.length()];
        
        for (int i = 0; i < numStr.length(); i++) {
            answer[i] = numStr.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}