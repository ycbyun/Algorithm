import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answerList.add(i);
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}