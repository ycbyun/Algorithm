class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];  

        for (int num : array) {
            count[num]++;
        }

        int max = 0;        
        int answer = -1;    
        boolean isDuplicate = false;  

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
                isDuplicate = false; 
            } else if (count[i] == max && max != 0) {
                isDuplicate = true;  
            }
        }

        return isDuplicate ? -1 : answer;
    }
}
