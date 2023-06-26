import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        char[] charArray = my_string.toCharArray();
        int number = 0;
        
        for (int i = 0; i< my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))) {
                number++;
            }
        }
        
        int[] answer = new int[number];
        int count = 0;
        
            for (int i = 0; i< my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))) {
                answer[count] = my_string.charAt(i)-48;
                count++;
            }
        }
  
        
        Arrays.sort(answer);
    
        
        return answer;
    }
}