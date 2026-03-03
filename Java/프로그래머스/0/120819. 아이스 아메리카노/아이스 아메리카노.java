class Solution {
    public int[] solution(int money) {
        int cup = money / 5500;
        int remain = money % 5500;
        int[] result = new int[2];
        result[0] = cup;
        result[1] = remain;
        return result;
    }
}