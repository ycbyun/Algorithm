import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        int case1 = min;
        
        int case2 = min - 1;
        
        return case1 + case2;
    }
}