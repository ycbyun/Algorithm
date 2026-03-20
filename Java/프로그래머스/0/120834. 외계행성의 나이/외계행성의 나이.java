class Solution {
    public String solution(int age) {
        String answer = "";
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        String strAge = String.valueOf(age);
        
        for (int i = 0; i < strAge.length(); i++) {
            int num = strAge.charAt(i) - '0';
            answer += arr[num];
        }
        
        return answer;
    }
}