import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        int minProduct = numbers[0] * numbers[1];
        
        int maxProduct = numbers[n - 1] * numbers[n - 2];
        
        return Math.max(minProduct, maxProduct);
    }
}