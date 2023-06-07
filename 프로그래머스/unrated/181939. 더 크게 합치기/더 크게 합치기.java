class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        
        
        String result1 = aa+bb;
        String result2 = bb+aa;
        
        int ab = Integer.valueOf(result1);
        int ba = Integer.valueOf(result2);
        
        if (ab > ba) {
            return(ab);
        } else if(ab < ba) {
            return(ba);
        }else {return(ab);}
    
        
    } 

}