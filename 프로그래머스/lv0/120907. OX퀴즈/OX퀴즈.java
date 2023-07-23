class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            int X = Integer.parseInt(parts[0]);
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            char operator = parts[1].charAt(0);

            int result;
            if (operator == '+') {
                result = X + Y;
            } else {
                result = X - Y;
            }

            if (result == Z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}