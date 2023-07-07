class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] numberi = new int[number.length()];
        
        for(int i =0; i < number.length(); i++) {
            numberi[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        
        int total = 0;
        for(int i = 0; i < numberi.length; i++) {
            total += numberi[i];
        }
        
        answer = total % 9 ;
        return answer;
    }
}