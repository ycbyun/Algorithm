class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        char[] result = new char[my_string.length()];
        for(int i=0; i < my_string.length(); i++) {
           result[i] = arr[my_string.length() - 1 - i]; 
        }
        return new String(result);
    }
}
