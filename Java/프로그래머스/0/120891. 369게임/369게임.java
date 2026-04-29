class Solution {
    public int solution(int order) {
        int count = 0;
        int[] number = String.valueOf(order)
                             .chars()
                             .map(Character::getNumericValue)
                             .toArray();
        
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if (num == 3 || num == 6 || num == 9) {
                count++;
            }
        }
        return count;
    }
}
