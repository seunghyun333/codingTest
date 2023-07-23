class Solution {
    public static int solution(int n) {
        int factorial = 1;
        int i = 1;

        // i!이 n보다 작거나 같은지 확인
        while (factorial <= n) {
            i++;
            factorial *= i;
        }

        // i!이 n보다 크면, i 값을 1 감소시켜서 n을 넘지 않는 최대 i를 찾음
        return i - 1;
    }
}