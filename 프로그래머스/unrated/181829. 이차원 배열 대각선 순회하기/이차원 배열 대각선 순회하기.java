class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int length1 = board.length;
        int length2 = board[0].length;
        
        for(int i = 0; i < length1; i++) {
            for(int j = 0; j < length2; j++) {
                if( i + j <= k) {
                    answer = answer + board[i][j];
                }
            }
            
        }
        return answer;
    }
}