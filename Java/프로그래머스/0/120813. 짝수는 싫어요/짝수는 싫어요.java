class Solution {
    public int[] solution(int n) {
        int num = (n + 1) / 2;
        int[] array = new int[num];
        int count = 0;
        for(int i = 0; i <= n ; i++){
            if (i % 2 == 1){
                array[count] = i;
                count ++;
            }
        }
        return array;
    }
}