import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger numbera = new BigInteger(a);
        BigInteger numberb = new BigInteger(b);
        BigInteger bigNumber = numbera.add(numberb);
  
        answer = bigNumber.toString();
        return answer;
    }
}