class Solution {
    public int[] solution(int[] numbers, String direction) {
    
    int temp1 = numbers[numbers.length - 1];
    int temp2 = numbers[0];
        
    if (direction.equals("right")) {
        for (int i = numbers.length - 1; i > 0 ; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = temp1;
        return numbers;
    } else {
        for (int j = 0; j < numbers.length - 1; j++) {
            numbers[j] = numbers[j + 1];
        } 
        numbers[numbers.length - 1] = temp2;
        return numbers;
    }
    }
}