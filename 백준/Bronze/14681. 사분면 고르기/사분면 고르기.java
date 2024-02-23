import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int answer = -1;
        
        if (x > 0) {
            if (y > 0) {
                answer = 1; // 제1사분면
            } else {
                answer = 4; // 제4사분면
            }
        } else {
            if (y > 0) {
                answer = 2; // 제2사분면
            } else {
                answer = 3; // 제3사분면
            }
        }
        
        System.out.println(answer);
        scanner.close();
    }
}
