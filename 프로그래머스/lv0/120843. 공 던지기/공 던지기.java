class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int[] newArray = new int[numbers.length * k];
        
        for (int i = 0; i < k ; i++) {
            for (int j = 0; j < numbers.length; j++) {
                newArray[i * numbers.length + j] = numbers[j];
            }
        }
        
        answer = newArray[((k-1) *2)];


        return answer;
    }
}
