class Solution {
    public String solution(int n) {
        String answer = "";
        
        if (n == 1 ){
            answer += "수";
        } else if (n == 2) {
            answer +="수박";
        } else if (n > 2){
            if(n % 2 == 0) {
                answer += "수박".repeat(n/2);
            } else {
                answer += "수박".repeat(n/2);
                answer += "수";
            }
        }
        
        return answer;
    }
}