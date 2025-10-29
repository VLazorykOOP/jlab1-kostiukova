package lab01.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть n (n ≤ 15): ");
        int n = sc.nextInt();

        // Перевірка обмеження
        if (n <= 0 || n > 15) {
            System.out.println("Помилка: n має бути в межах 1..15");
            return;
        }

        int[][] A = new int[n][n];

        System.out.println("Введіть елементи матриці " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
 // Знаходимо рядки, де всі елементи однакові
        System.out.print("Рядки, у яких всі елементи однакові: ");
        boolean foundRow = false;
        for (int i = 0; i < n; i++) {
            boolean allEqual = true;
            for (int j = 1; j < n; j++) {
                if (A[i][j] != A[i][0]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                System.out.print((i + 1) + " ");
                foundRow = true;
            }
        }
        if (!foundRow) System.out.print("немає");

        System.out.println();

        // Знаходимо стовпчики, де всі елементи парні
        System.out.print("Стовпчики, у яких всі елементи парні: ");
        boolean foundCol = false;
        for (int j = 0; j < n; j++) {
            boolean allEven = true;
            for (int i = 0; i < n; i++) {
                if (A[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                System.out.print((j + 1) + " ");
                foundCol = true;
            }
        }
        if (!foundCol) System.out.print("немає");

        System.out.println();
        sc.close();
    }
}