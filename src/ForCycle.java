import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        System.out.print("Введите число для поиска пар: ");
        int valueNumber = new Scanner(System.in).nextInt();

        if (valueNumber < 0) {
            System.out.println("Тут что - то отридцательное. Попробуйте ввести положительное число");
        }

        System.out.println("Как заказывали! Все пары положительных целых чисел!");

        for ( int i =1 ; i <= valueNumber; i++) {

            if (valueNumber % i == 0) {
                int reminder = valueNumber / i;
                System.out.println(reminder +"*"+ i);
            }

            }
        }


    }








