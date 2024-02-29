import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int b = 0;
        
        for(int i = 1; i <= A; i++) {
            b = b+i;
        }
        
        scanner.close();
        System.out.println(b);
    }
}