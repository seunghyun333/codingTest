class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        int count = 1;
        
        if(arr[idx] == 1) {
                answer = idx;
        } else {
            for(int i = 0; i < arr.length-idx; i++) {
                if(arr[idx+i] ==1) {
                    answer = idx+i;
                    break;
                } 
                
            }
            
        }
        
       
        return answer;
    }
}