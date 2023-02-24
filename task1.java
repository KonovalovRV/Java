/**
 * task1
 */
import java.util.Scanner;
public class task1 {
    
    static int factorial (int n) {
        if (n==0 | n==1) return  1;
        return (n * factorial( n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите любое натуральное число --> ");
        int n = sc.nextInt();
        sc.close();
       System.out.println(factorial(n)); // 1 2 3 4
    
    }
}