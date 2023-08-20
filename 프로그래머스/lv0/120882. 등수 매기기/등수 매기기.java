import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        // 평균 점수
        for(int i = 0; i < score.length; i++) {
            int sum = score[i][0] + score[i][1];
            answer[i] = sum;
        }
        
        // 등수 계산
        int[] rank = new int[answer.length];
        for(int i = 0; i < rank.length; i++) {
            rank[i] = 1; // 초기 등수를 1로 설정
            
            for(int j = 0; j < rank.length; j++) {
                if(i != j && answer[i] < answer[j]) {
                    rank[i]++;
                }
            }
        }
        
        return rank;
    }
}