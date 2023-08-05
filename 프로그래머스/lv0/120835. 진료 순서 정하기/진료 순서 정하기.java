import java.util.Arrays;
import java.util.Comparator;

// 연구 필요
class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] result = new int[n];

        // 응급도와 인덱스를 함께 저장하기 위한 배열 생성
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = emergency[i]; // 응급도
            pairs[i][1] = i; // 인덱스
        }

        // 응급도를 기준으로 내림차순으로 정렬
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });

        // 진료 순서를 결정하는 배열 생성
        int[] order = new int[n];
        int idx = 1;

        // 정렬된 pairs를 기준으로 진료 순서 결정
        for (int i = 0; i < n; i++) {
            order[pairs[i][1]] = idx++;
        }

        // 결과 배열 생성
        for (int i = 0; i < n; i++) {
            result[i] = order[i];
        }

        return result;
    }
}
