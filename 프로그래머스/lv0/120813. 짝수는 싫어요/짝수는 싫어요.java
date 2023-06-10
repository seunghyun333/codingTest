class Solution {
    public int[] solution(int n) {
        int a = 0;
        int b = 0;
       int[] answer;

        
        if(n % 2 != 0){
            answer = new int[n/2+1];
            for(int i = 1; i <= n; i+=2) {
                answer[b] = i;
                b++;

         } 
        }else {
            answer = new int[n/2];
            for(int i = 1; i < n; i+=2) {
                answer[b] = i;
                b++;
            
        }  
}  return answer;
     }
}