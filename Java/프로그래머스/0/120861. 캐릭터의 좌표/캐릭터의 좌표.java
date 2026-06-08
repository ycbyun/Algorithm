class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            int nextX = x;
            int nextY = y;
            
            switch (key) {
                case "up":    nextY++; break;
                case "down":  nextY--; break;
                case "left":  nextX--; break;
                case "right": nextX++; break;
            }
            
            if (nextX >= -maxX && nextX <= maxX && nextY >= -maxY && nextY <= maxY) {
                x = nextX;
                y = nextY;
            }
        }
        
        return new int[]{x, y};
    }
}