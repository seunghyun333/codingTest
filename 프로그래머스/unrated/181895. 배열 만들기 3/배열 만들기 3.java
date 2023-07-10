class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int first = intervals[0][0];
        int second = intervals[0][1];
        int third = intervals[1][0];
        int fourth = intervals[1][1];
        
        int arraylen = second - first + 1 + fourth - third + 1;
        int[] answer = new int[arraylen];
        
        
        int count = 0;
        for (int i = first; i < second + 1; i++) {
            answer[count] = arr[i];
            count++;
        }
        
        for (int i = third; i < fourth + 1; i++) {
            answer[count] = arr[i];
            count++;
        }
        
        
        
        return answer;
    }
}