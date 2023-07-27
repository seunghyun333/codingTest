import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }

        BigInteger on = BigInteger.ONE;
        for (int i = balls; i > 0; i--) {
            on = on.multiply(BigInteger.valueOf(i));
        }

        BigInteger b1 = BigInteger.ONE;
        for (int i = balls - share; i > 0; i--) {
            b1 = b1.multiply(BigInteger.valueOf(i));
        }

        BigInteger b2 = BigInteger.ONE;
        for (int i = share; i > 0; i--) {
            b2 = b2.multiply(BigInteger.valueOf(i));
        }

        BigInteger result = on.divide(b1.multiply(b2));
        return result.intValue();
    }
}