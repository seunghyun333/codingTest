import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int b1 = B / 100;
        int b2 = (B % 100) / 10; 
        int b3 = B % 10;
        
        System.out.println(A*b3);
        System.out.println(A*b2);
        System.out.println(A*b1);
        System.out.println(A*B);
        
        scanner.close();

                
    }
}