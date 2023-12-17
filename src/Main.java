import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("N değerini gir: ");
        int n = scan.nextInt();

        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }

        System.out.println(sum);
    }
}
