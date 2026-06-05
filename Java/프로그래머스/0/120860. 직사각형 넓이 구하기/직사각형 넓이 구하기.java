import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int[] xCoords = new int[4];
        int[] yCoords = new int[4];

        for (int i = 0; i < 4; i++) {
            xCoords[i] = dots[i][0];
            yCoords[i] = dots[i][1];
        }

        Arrays.sort(xCoords);
        Arrays.sort(yCoords);

        int width = xCoords[3] - xCoords[0];
        int height = yCoords[3] - yCoords[0];

        return width * height;
    }
}