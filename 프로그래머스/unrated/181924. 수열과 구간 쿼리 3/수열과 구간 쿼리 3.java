class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int len = queries.length;
        
        for (int i = 0; i <len; i++) {
           int a = queries[i][0];
           int b = queries[i][1];
            int c = answer[a];
            answer[a] = answer[b];
            answer[b] = c;
            
        }
        
        return answer;
    }
}