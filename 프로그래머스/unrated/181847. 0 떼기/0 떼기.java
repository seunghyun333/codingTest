class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[ ] charArray = n_str.toCharArray();
        
        
        for (int i = 0; i<n_str.length(); i++){
            if(charArray[i] != '0'){
                answer = n_str.substring(i,n_str.length());
                break;
            }
        }
        return answer;
    }
}