import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        List<String> resultList = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) { // 길이가 0인 문자열은 결과에 추가하지 않음
                resultList.add(part);
            }
        }

        Collections.sort(resultList);

        return resultList.toArray(new String[0]);
    }
}