class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;
        int result1 = 1;
        int result2 = 0;
        int length = num_list.length;
        
        for(int i = 0; i < length; i++){
            result += num_list[i]; //모든 원소들의 합
            result2 = result * result; //모든 원소들의 합의 제곱
            result1 = result1 * num_list[i]; // 모든 원소들의 곱
            
            if(result1 < result2) {
                answer = 1;
            } else {
                answer = 0;
            }
         } return answer;
    }   
   }  
    
