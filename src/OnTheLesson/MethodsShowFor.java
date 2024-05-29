package OnTheLesson;

import java.util.Scanner;

public class MethodsShowFor {

    int number1;
    int number2;

    int getNumber1() {
        return number1 = new Scanner(System.in).nextInt();

    }

    int getNumber2() {
        return number2 = new Scanner(System.in).nextInt();
    }

    void printUp() {
        System.out.println("Введите число с верхним лимитом");
    }

    void printDown() {
        System.out.println("Введите число с нижним приделом");
    }

    void zeroTen(int number1, int number2) {
        if (number2 > number1) {
            System.out.println("Не верные данные. Попробуйте еще. ");
        }

        for (int i = number2; i <= number1; i++) {
            System.out.println(i);
        }
    }

    void tenToZero(int number1, int number2) {
        if (number2 > number1) {
            System.out.println("Не верные данные. Попробуйте еще. ");
        }
        for (int i = number1; i >= number2; i--) {
            System.out.println(i);
        }
    }

    void evenNumbers(int number1, int number2) {
        if (number2 % 2 == 0) {
            System.out.println("Будудт четные числа");
        } else {
            System.out.println("Не четные ");
        }

        for (int i = number2; i <= number1; i += 2) {
            System.out.println(i);
        }
    }

    void Cycles() {


        int sum = 0;
        int value;
        boolean switchOff = true;
        //:TODO
        // сделать корректный выход
        /*String commandOfExit = "exit";*/

        while (switchOff) {
            if (sum == 0) {
                System.out.println("Введите число");
            }

            value = new Scanner(System.in).nextInt();



            if (value > 0 || value < 0) {
                sum += value;
                System.out.println("Сумма " + sum);
                System.out.println("Введите ещё одно число или 0 для сброса суммы:");

            }/* else if( commandOfExit.equals(Integer.toString(value))) {
                switchOff = false;
            }*/ else {
                System.out.println("Общая сумма введенных чисел: " + sum);
                System.out.println("Сумма сброшена. Введите новое число:");
                sum = 0;

            }

        }

    }


}
