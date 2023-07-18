class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b){
            answer = a;
            return answer; 
        } else if (a > b) {
            for (int i = b+1; i < a; i++) {
                answer += i;
            }
        } else if (b > a) {
            for (int i = a+1; i < b; i++) {
                answer += i;
            }
        }
            answer = answer + a+ b;
        return answer;
    }
}