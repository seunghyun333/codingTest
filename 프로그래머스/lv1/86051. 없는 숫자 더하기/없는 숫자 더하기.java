class Solution {
public int solution(int[] numbers) {
    // 0부터 9까지의 숫자를 저장할 배열 생성
    int[] found = new int[10];
    
    // numbers 배열을 반복하며 found 배열 갱신
    for (int num : numbers) {
        found[num]++;
    }
    
    int sum = 0;
    
    // found 배열을 순회하며 0인 값들을 0부터 9까지의 숫자로 간주하여 더하기
    for (int i = 0; i < found.length; i++) {
        if (found[i] == 0) {
            sum += i;
        }
    }
    
    return sum;
}
}