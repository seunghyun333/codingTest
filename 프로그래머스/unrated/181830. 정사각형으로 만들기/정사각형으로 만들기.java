class Solution {
    public int[][] solution(int[][] arr) {
        int len = arr.length;
        int len2 = arr[0].length;
        int[][] answer = {};
        
        if(len > len2) {
            answer = new int[len][len];
        } else if(len == arr[0].length) {
            answer = arr;
            return answer;
        } else {
            answer = new int[len2][len2];
        }
        
        
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}