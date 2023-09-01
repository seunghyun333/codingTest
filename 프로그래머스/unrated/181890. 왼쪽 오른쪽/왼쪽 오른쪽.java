import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        int indexOfL = -1; // "l"이 나온 위치
        int indexOfR = -1; // "r"이 나온 위치

        // "l" 또는 "r"을 처음으로 만날 때까지 반복
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                indexOfL = i;
                break;
            } else if (str_list[i].equals("r")) {
                indexOfR = i;
                break;
            }
        }

        // "l" 또는 "r"을 찾지 못한 경우 빈 리스트 반환
        if (indexOfL == -1 && indexOfR == -1) {
            return new String[0];
        }

        // "l" 또는 "r"을 찾은 경우, 해당 위치를 기준으로 왼쪽 또는 오른쪽의 문자열을 추출하여 리스트에 추가
        List<String> resultList = new ArrayList<>();
        if (indexOfL != -1) {
            for (int i = 0; i < indexOfL; i++) {
                resultList.add(str_list[i]);
            }
        } else {
            for (int i = indexOfR + 1; i < str_list.length; i++) {
                resultList.add(str_list[i]);
            }
        }

        // 리스트를 문자열 배열로 변환하여 반환
        return resultList.toArray(new String[0]);
    }
}