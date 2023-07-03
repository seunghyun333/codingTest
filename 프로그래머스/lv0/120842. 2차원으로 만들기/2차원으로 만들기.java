import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows =  num_list.length / n; // 행의 개수
        int[][] result = new int[rows][n]; // 결과 배열 초기화

        int index = 0; // num_list에서 원소를 가져오기 위한 인덱스 변수

        // num_list의 원소들을 2차원 배열로 옮깁니다.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                if (index < num_list.length) {
                    result[i][j] = num_list[index++];
                } 
            }
        }

        return result;
    }
}