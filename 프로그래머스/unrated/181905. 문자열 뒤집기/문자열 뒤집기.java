class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int num = e - s;
        
        for (int i = 0; i < s; i++){
         answer += my_string.charAt(i);
        }
        
        int ee = e;
        
        for (int i = 0; i < num+1; i++) {
            answer += my_string.charAt(ee);
            ee--;
        }
        
        int eee = e;
        
        for (int i = 0; i < my_string.length()-e-1; i++) {
            answer += my_string.charAt(eee+1);
            eee++;
        }
        return answer;
    }
}