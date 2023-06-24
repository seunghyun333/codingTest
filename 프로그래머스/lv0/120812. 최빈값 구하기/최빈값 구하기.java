class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];  // 숫자의 등장 횟수를 저장할 배열

        int maxCount = 0;  // 가장 자주 등장한 횟수
        int mode = -1;  // 최빈값 초기값 설정

        // 각 숫자의 등장 횟수를 세어 counts 배열에 저장
        for (int num : array) {
            counts[num]++;
        }
        
//         for (int i = 0; i < array.length; i++) {
//        int num = array[i];
//          counts[num]++; }

        
        // 등장 횟수를 비교하여 최빈값 구하기
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mode = i;
            } else if (counts[i] == maxCount) {
                mode = -1;  // 최빈값이 여러 개인 경우 -1로 설정
            }
        }

        return mode;
    }
}