class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] charArray = rsp.toCharArray();

        
        for(int i = 0 ; i < rsp.length(); i++) {
            if(charArray[i]=='2') {
                answer = answer + '0';
            } else if(charArray[i]=='0') {
                answer = answer + '5';
            }else if(charArray[i]=='5') {
                answer = answer + '2';
            }
            
    } 
        return answer;       
    } 
}
