package OnTheLesson;


import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {
        MethodsShowFor show = new MethodsShowFor();

        int exit = -1;

        while (exit != 0) {

            System.out.println("__________________________________________________\n"+
                    "Меню:\n"+
                    "1. Цикл, который будет выводить числа от 0 до 10\n" +
                    "2. Цикл, который будет выводить числа от 5 до 15\n" +
                    "3. Цикл, который будет выводить числа от 10 до 0\n" +
                    "4. Цикл, который будет выводить числа от 17 до 9\n" +
                    "5. Цикл, который будет выводить только чётные числа от 0 до 10 (0, 2, 4, 6, 8 и 10)\n" +
                    "6. Цикл while который будет складывать числа");
            System.out.println("Какую домашнюю работу запустить?");
            int numberOfHomeWork = new Scanner(System.in).nextInt();

            int number1 = 0;
            int number2 = 0;
            if (numberOfHomeWork < 6) {show.printUp();
                number1 = show.getNumber1();
                show.printDown();
                number2 = show.getNumber2();
            }

            /*switch (numberOfHomeWork) {
                case 1:
                case 2:
                    show.zeroTen(number1, number2);
                    break;
                case 3:
                case 4:
                    show.tenToZero(number1, number2);
                    break;
                case 5:
                    show.evenNumbers(number1, number2);
                    break;
                case 6:
                    show.Cycles();
                    break;
                default:
                    exit = 0;
                    System.out.println("Спокойной ночи");
            }*/
            switch (numberOfHomeWork) {
                case 1 -> show.zeroTen(number1, number2);
                case 2 -> show.zeroTen(number1, number2);
                case 3 -> show.tenToZero(number1, number2);
                case 4 -> show.tenToZero(number1, number2);
                case 5 -> show.evenNumbers(number1, number2);
                case 6 -> show.Cycles();
                default -> System.out.println("Спокойной ночи");
                           }

        }

        System.out.println("Этот текст для проверки изменений в мастер коммите. Эти изменения остануться только в матере");

    }

}

