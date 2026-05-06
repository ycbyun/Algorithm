import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        String[] numberWords = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"
        };
        
        for (int i = 0; i < numberWords.length; i++) {
            numbers = numbers.replace(numberWords[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}