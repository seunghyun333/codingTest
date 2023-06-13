class Solution {
    public int solution(int i, int j, int k) {
        char K = (char) ('0' + k);
        int result = 0;
        for (int n = i; n <= j; ++n) {
            for (char ch : Integer.toString(n).toCharArray()) {
                if (ch == K) {
                    ++result;
                }
            }
        }
        return result;
    }
}