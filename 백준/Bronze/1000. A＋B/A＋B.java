import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 정수 A와 B를 입력받음
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        int B = scanner.nextInt();
        
        // A와 B를 더한 값을 출력
        int result = A + B;
        System.out.println(result);
        
        // Scanner를 닫아줌
        scanner.close();
    }
}
