import java.util.Random;
import java.util.Scanner;

public class Task3AllCalculatorAndStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер операции (1 - калькулятор, 2 - массив строк)");
        int z; //variable to choice
        z = sc.nextInt();
        choice(z);
        sc.close();
    }

    //Calculator
    public static int calc() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x1 = sc2.nextInt();//первое число
        System.out.println("Введите второе число");
        int x2 = sc2.nextInt();//второе число
        System.out.println("Введите операцию");
        String x3 = sc2.next();//операция
        switch (x3) {
            case "+":
                System.out.println("Сумма чисел = " + (x1 + x2));
                break;
            case "-":
                System.out.println("Разница чисел = " + (x1 - x2));
                break;
            case "/":
                System.out.println("Частное чисел = " + (x1 / x2));
                break;
            case "*":
                System.out.println("Произведение чисел = " + (x1 * x2));
                break;
        }
        sc2.close();
        return 0;
    }

    //StringArray

    /**
     * @see #string2() not null
     */
    public static String string2() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите количество слов");
        int n = sc3.nextInt();//массив из n строк
        int max = 0;
        int val1 = 0;
        String []arrStr = new String[n];//длинна массива = количеству строк
        System.out.println("Введите строки");
        for (int i = 0; i<n; i++){
            arrStr[i] = sc3.next();
            int str1 = i +1;
            System.out.println("Строка " + str1  + ": " + arrStr[i]);
        }
        //Поиск максимальной строки
        for (int i = 0; i<n; i++){
            if (max< arrStr[i].length()){
                max = arrStr[i].length();
                val1 = i;
            } else  if (max == arrStr[i].length()){
                continue;
            }
        }
        System.out.println("Максимальное количество символов в слове - " + arrStr[val1]);

        return null;
    }

    //Choice operations
    public static int choice(int z) {
        if (z == 1) {
            calc();
        } else if (z == 2) {
            string2();
        }
        return 0;
    }

}
