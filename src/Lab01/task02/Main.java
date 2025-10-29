package lab01.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення n
        System.out.print("Введіть n (n ≤ 200): ");
        int n = sc.nextInt();
		if (n <= 0 || n > 200) {
    System.out.println("Помилка: n має бути в межах від 1 до 200.");
    return; // Завершуємо програму
}

        // Оголошення масиву A довжиною 2n
        double[] A = new double[2 * n];

        // Введення елементів масиву
        System.out.println("Введіть " + (2 * n) + " дійсних чисел:");
        for (int i = 0; i < 2 * n; i++) {
            A[i] = sc.nextDouble();
        }

        // 1. Знаходимо середнє арифметичне першої половини A[0..n-1]
        double sumFirstHalf = 0;
        for (int i = 0; i < n; i++) {
            sumFirstHalf += A[i];
        }
        double avgFirst = sumFirstHalf / n;

        // 2. Знаходимо суму чисел другої половини A[n..2n-1],
        //    які більші за середнє
        double sumResult = 0;
        for (int i = n; i < 2 * n; i++) {
            if (A[i] > avgFirst) {
                sumResult += A[i];
            }
        }

        // 3. Виводимо результат
        System.out.println("Сума елементів другої половини, більших за середнє першої половини: " + sumResult);
    }
}