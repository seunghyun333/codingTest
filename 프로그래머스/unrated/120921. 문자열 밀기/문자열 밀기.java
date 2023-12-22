class Solution {
    public int solution(String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        }

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return i;
            }
            A = rotateRight(A);
        }
        return -1;
    }

    private String rotateRight(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str.substring(0, str.length() - 1);
    }
}