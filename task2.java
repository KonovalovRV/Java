import java.util.Scanner;

public class task2 {

    static void FindPrimeNum(int n) {
        int j;
        int i;
        for (i = 1; i <= n; i++)
            for (j = 0; j <= n; j++)
                    if (i % j == 0){
                        if (i == j)
                            System.out.print(i + " ");
                        break;
                    }
        }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите любое натуральное число от 1 до 1000: ");
        int n = iScanner.nextInt();
        iScanner.close();

        FindPrimeNum(n);

    }

}
