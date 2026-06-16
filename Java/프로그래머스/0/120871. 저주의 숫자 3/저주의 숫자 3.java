class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer++;
            
            while (isForbidden(answer)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isForbidden(int num) {
        if (num % 3 == 0) {
            return true;
        }
        
        String strNum = String.valueOf(num);
        if (strNum.contains("3")) {
            return true;
        }
        
        return false;
    }
}