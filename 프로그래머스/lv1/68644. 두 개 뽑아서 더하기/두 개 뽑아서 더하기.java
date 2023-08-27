import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 정렬된 배열로 변환
        List<Integer> sortedAnswerList = new ArrayList<>(answerSet);
        Collections.sort(sortedAnswerList);

        int[] answer = new int[sortedAnswerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sortedAnswerList.get(i);
        }

        return answer;
    }
}