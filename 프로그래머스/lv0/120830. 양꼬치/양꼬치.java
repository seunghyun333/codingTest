class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheep = n * 12000;
        int cola = k * 2000;
        
        if(n / 10 >= 1){
            answer = sheep + cola - (n / 10 * 2000);
        } else {
            answer = sheep + cola ;
        }
        return answer;
    }
}