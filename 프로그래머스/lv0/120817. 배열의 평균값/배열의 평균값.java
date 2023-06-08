class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double answer1 = 0;
        int length = numbers.length;
        
        for(int i = 0; i < length; i++) {
            answer = answer + numbers[i];
            answer1 = answer / length;
            
        }
        
        return answer1;
    }
}