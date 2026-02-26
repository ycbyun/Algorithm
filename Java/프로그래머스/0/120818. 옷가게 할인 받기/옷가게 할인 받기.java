class Solution {
    public int solution(int price) {
        double result = 0;
        if (price >= 500000) {
            result = price * 0.8;
            }
        else if (price >= 300000) {
            result = price * 0.9;
            }
        else if (price >= 100000) {
            result = price * 0.95;
        } else {
            result = price;
        }
        return (int)result;
    }
}

//50 작으면 최대 10
//30 작으면 최대 5
//10 작으면 그냥
//나머지는 20