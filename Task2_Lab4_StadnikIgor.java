import java.util.Scanner;
// Варіант 1. 1. За введеним цілим числом утворити число з цифрами, поданими у зворотному порядку (реверс цілого числа: 3210 — 0123). При виведенні результату для відображення попередніх нулів скористатися форматованим виведенням, розміром поля виведення, заповнювачем поля виводу (наприклад, %010d) 

public class Task2_Lab4_StadnikIgor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = sc.nextInt();
        sc.close();

        int reversed = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.printf("Реверс: %010d%n", reversed);
    }
}
