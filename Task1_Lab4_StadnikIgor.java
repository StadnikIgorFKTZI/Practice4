import java.util.Scanner;

// Варіант 2. За трьома заданими числами визначити, чи може існувати трикутник з такими сторонами. Якщо так, то визначити, його вид: різнобічний, рівнобедрений чи рівнобічний.
public class Task1_Lab4_StadnikIgor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть три сторони ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Трикутника с такими сторонами не існує.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Трикутника є рівностороннім.");
        } else if (a == b && b == c) {
            System.out.println("Трикутника є рівнобічним.");
        }  else {
            System.out.println("Трикутник різносторонній ");
        }
        
        scanner.close();

        
        
    }
}