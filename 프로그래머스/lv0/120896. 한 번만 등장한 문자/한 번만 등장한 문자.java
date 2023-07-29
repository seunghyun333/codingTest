import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] charCount = new int[256]; 

        // 문자열의 등장 빈도를 세기
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        // 결과 문자열 생성
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (charCount[c] == 1) {
                answer.append(c);
            }
        }

        // 사전 순으로 정렬된 문자열 생성
        char[] sortedChars = answer.toString().toCharArray();
        Arrays.sort(sortedChars);
        return new String(sortedChars);
    }
}