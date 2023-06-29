

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            if ((i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) && i != 2 && i != 3 && i != 5 && i != 7) {
                answer++;
            } 
        }
        return answer;
    }
}



//1과 소수를 제외한 모든 수가 합성수임 