class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2]; 
        int posX = 0; 
        int posY = 0;


         //Math.max(posX - 1, -board[0] / 2)는 두 값 중에서 더 큰 값을 선택하는 함수
        
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left":
                    posX = Math.max(posX - 1, -board[0] / 2);
                    break;
                case "right":
                    posX = Math.min(posX + 1, board[0] / 2);
                    break;
                case "up":
                    posY = Math.min(posY + 1, board[1] / 2);
                    break;
                case "down":
                    posY = Math.max(posY - 1, -board[1] / 2);
                    break;
            }
        }

        answer[0] = posX;
        answer[1] = posY;
        
        return answer;
    }
}
