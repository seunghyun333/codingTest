import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int repeatCount = arr[i] * 2;
                for (int j = 0; j < repeatCount; j++) {
                    resultList.add(arr[i]);
                }
            } else {
                int removeCount = arr[i];
                if (resultList.size() >= removeCount) {
                    int newSize = resultList.size() - removeCount;
                    resultList.subList(newSize, resultList.size()).clear();
                }
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}