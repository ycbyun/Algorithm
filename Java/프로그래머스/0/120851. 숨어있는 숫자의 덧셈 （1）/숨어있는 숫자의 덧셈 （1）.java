class Solution {
    public int solution(String my_string) {
        String mystring = my_string.replaceAll("[a-zA-Z]","");       
        int result = 0;
        
        for (int i = 0; i < mystring.length(); i++) {
            result += mystring.charAt(i) - '0';
        }
        return result;
    }
}