import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answerList.add(i);
                
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}