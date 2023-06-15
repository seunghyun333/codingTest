class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pizza = new int[100];
        
        for (int i = 1; i < 100; i++) {
            pizza[i] = 6 * i;
        }
        
        for (int i = 0; i < 100; i++) {
            for (int k = 1; k < 100; k++) {
            if(pizza[i] == n * k) {
                answer = i;
                break;
            }
        }   
            if(answer != 0) {
                break;
            }
        
//         if(n % 6 == 0) {
//             answer = n/6;     
//         } else if (n % 2 == 0 && n % 6 != 0) {
//             answer = n / 2;
//         } else if (n % 3 == 0 && n % 6 != 0) {
//             answer = n / 3;
//         } else if (n % 6 !=0 && n % 3 != 0 && n % 2 != 0) {
//             answer = n * 6;
//         }
       
    }return answer; 
}}