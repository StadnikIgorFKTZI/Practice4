import java.util.Scanner;

public class Task3_Lab4_StadnikIgor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть непарне число n: ");
        int n = sc.nextInt(); // наприклад 7
        sc.close();

        int mid = n / 2; // індекс середнього рядка

        // верхня половина включно з серединним рядком
        for (int i = 0; i <= mid; i++) {
            // пробіли
            for (int s = 0; s < mid - i; s++) System.out.print(" ");
            // зірочки
            for (int k = 0; k < 2 * i + 1; k++) System.out.print("*");
            System.out.println();
        }

        // нижня половина (без серединного рядка)
        for (int i = mid - 1; i >= 0; i--) {
            for (int s = 0; s < mid - i; s++) System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
