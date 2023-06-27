class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String real = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                real += 'B';
            } else {
                real += 'A';
            }
        }
        
        if(real.contains(pat)){
            answer = 1; 
        } else {
            answer = 0;
        }
        return answer;
    }
}