class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        for (int i = 1; i <= max; i++) {
            if(i+min > max) {
                answer++;
            }
        }
        
        for (int i = max+1; i < min+max; i++) {
            answer++;
        }
        
        return answer;
    }
}