class Solution {
    public int solution(int n) {
        for (int a = 1; a <= n; a ++) {
            if (6 * a % n == 0) {
                return a;
            } 
        }
        return 0;
    }
}