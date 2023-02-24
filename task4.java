import java.util.Scanner;

public class task4 {
    
   static void calc (double a, double b,String key){
    switch (key) {
        case "+": 
            System.out.println(a+b);
            break;
        case "/": 
            System.out.println(a/b);
            break;
        case "*": 
            System.out.println(a * b);
            break;
        case "-": 
            System.out.println(a -b);
            break;
        default:
        System.out.println("Введен неверный оператор ");
            break;
}

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.printf("Введите первое число --> ");
        int a = sc.nextInt();
        System.out.printf("Введите второе число --> ");
        int b = sc.nextInt();
        System.out.println("Введите арифметический оператор: -   +  *  / ");
        String key = s.nextLine();
       sc.close();
        s.close();
        calc(a,b,key);
    }
}
