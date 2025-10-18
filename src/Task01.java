import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Варіант 1: вхідні дані дійсного типу, результат - дійсний
        System.out.println("Введіть n (double): ");
        double n1 = sc.nextDouble();
        System.out.println("Введіть m (double): ");
        double m1 = sc.nextDouble();

        double res1 = Math.pow((n1 + 1) / (m1 + 2) + 5 / (n1 - m1), 2) * (n1 * m1);
        System.out.println("Варіант 1 (double → double): " + res1);

        // Варіант 2: вхідні дані цілого типу, результат - дійсний
        System.out.println("Введіть n (int): ");
        int n2 = sc.nextInt();
        System.out.println("Введіть m (int): ");
        int m2 = sc.nextInt();

        double res2 = Math.pow((double)(n2 + 1) / (m2 + 2) + 5.0 / (n2 - m2), 2) * (n2 * m2);
        System.out.println("Варіант 2 (int → double): " + res2);

        // Варіант 3: вхідні дані дійсного типу, результат - цілий
        System.out.println("Введіть n (double): ");
        double n3 = sc.nextDouble();
        System.out.println("Введіть m (double): ");
        double m3 = sc.nextDouble();

        int res3 = (int) (Math.pow((n3 + 1) / (m3 + 2) + 5 / (n3 - m3), 2) * (n3 * m3));
        System.out.println("Варіант 3 (double → int): " + res3);

        sc.close();
    }
}