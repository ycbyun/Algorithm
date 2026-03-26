class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        String[] words = letter.split(" ");
        
        StringBuilder answer = new StringBuilder();
        
        for (String word : words) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) {
                    answer.append((char) (i + 'a'));
                    break;
                }
            }
        }
        
        return answer.toString();
    }
}