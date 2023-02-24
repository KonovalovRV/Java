
import java.util.Scanner;
public class task3 {
    
    static int trianglNumber(int n) {
        if (n <= 0)
            return 0;
        return (n + trianglNumber(n - 1));
    }  
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите любое натуральное число --> ");
        int n = sc.nextInt();
        sc.close();
       
        System.out.println(trianglNumber(n)); // 1 2 3 4  
    }
}
