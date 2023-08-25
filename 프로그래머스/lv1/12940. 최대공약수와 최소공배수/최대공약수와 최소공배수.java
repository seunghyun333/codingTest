class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        answer[0] = gcd(big, small); // 최대공약수 계산
        answer[1] = lcm(big, small); // 최소공배수 계산
        
        return answer;
    }
    
    // 최대공약수 계산 (유클리드 호제법 사용)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 최소공배수 계산 (두 수의 곱 / 최대공약수)
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}