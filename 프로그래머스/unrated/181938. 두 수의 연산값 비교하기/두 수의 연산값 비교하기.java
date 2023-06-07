class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab2 = 2 * a * b;
        int ab = Integer.parseInt(a+""+b);
        
        if (ab2 > ab) {
            answer = ab2;
        } else {
            answer = ab;
        }
               return answer;                   
        
        
    }
}