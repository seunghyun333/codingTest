class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int count = 0;
        
        for(int i = start; i > end-1; i--) {
            answer[count] = i;
            count++;
        }
  
        return answer;
    }
}