class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        char[] input = rsp.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '2') {
                result.append("0");
            } else if (input[i] == '0') {
                result.append("5");
            } else {
                result.append("2");
            }  
        }
        return result.toString(); 
    }
}