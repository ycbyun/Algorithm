class Solution {
    public int solution(int n) {
        for (int i = 10; i > 0; i--) {
            int count = 1;
            for (int j = i; j > 0; j--) {
                count *= j;
            }
            if (count <= n) {
                return i;
            }
        }
        return 0;
    }
}


