class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[ ] charArray = my_string.toCharArray();
        int number = 0;
        
        for(int i = 0; i< charArray.length; i++){
            if(Character.isDigit(charArray[i])){
                answer += Character.getNumericValue(charArray[i]);
            }
        }
        return answer;
    }
}