class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;

        a = money / 5500;
        b = money - (5500 * a);
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}