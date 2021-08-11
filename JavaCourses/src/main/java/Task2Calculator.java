import java.util.Scanner;

/**
 * Написание калькулятора сложения вещественных чисел, введенные пользователем
 * и выданные результатом сложения на консоль
 * @author Ronobi
 * @see #method2()
 */

public class Task2Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вводим первое число
        System.out.print("Input first value: ");
        double first = scanner.nextInt();
        //вводим второе число
        System.out.print("Input second value ");
        double second = scanner.nextInt();
        double j = first+second;
        /**
         * Вывод и округление суммы до 4 знаков после запятой
         * */
        System.out.printf("Sum first value and second value = %.4f", j);
        scanner.close();
    }
    public static void method2(){
        System.out.println("Method for @see, migrate");
    };
}
