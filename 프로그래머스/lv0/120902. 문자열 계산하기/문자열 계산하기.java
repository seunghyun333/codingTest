class Solution {
    public long solution(String my_string) {
        long answer = 0;
        String[] neww = my_string.split(" ");

        answer = Long.parseLong(neww[0]);

        for (int i = 1; i < neww.length; i += 2) {
            String operator = neww[i];
            long num = Long.parseLong(neww[i + 1]);

            if (operator.equals("+")) {
                answer += num;
            } else if (operator.equals("-")) {
                answer -= num;
            }
        }

        return answer;
    }
}