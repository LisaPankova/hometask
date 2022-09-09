import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите пункт, введя нужную цифру:");
        System.out.println("1. Калькулятор квадратного уравнения.");
        System.out.println("2. Таблица умножения.");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();

        if (k == 1) {
            System.out.println("ax^2+bx+c=0");
            System.out.println("Введите a, b, c:");
            int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
            int D;
            if (a != 0) {
                D = b * b - 4 * a * c;
                if (D < 0) System.out.println("Вещественных корней нет.");
                if (D == 0) System.out.println("x = " + (-b / 2 * a));
                if (D > 0)
                    System.out.println("x1 = " + ((-b - Math.sqrt(D)) / 2 * a) + ", x2 = " + ((-b + Math.sqrt(D)) / 2 * a));
            } else if (b != 0) System.out.println(-c / b);
            else if (c != 0) System.out.println(c + " не может быть равно 0.");
            else System.out.println("0 = 0");
        }

        if (k == 2) {
            System.out.println("Аккуратная таблица умножения.");
            int[] Umno = new int[11];
            for (int i = 1; i < 11; i++) {
                Umno[i] = i;
            }
            for (int j = 1; j < 11; j++) {

                for (int i = 1; i < 11; i++) {
                    System.out.print(j * Umno[i] + " \t");
                }
                System.out.println();
            }
        }
    }
}