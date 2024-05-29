import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        System.out.print("Введите число для поиска пар: ");
        int valueNumber = new Scanner(System.in).nextInt();

        if (valueNumber < 0) {
            System.out.println("Тут что - то отридцательное. Попробуйте ввести положительное число");
        }

        System.out.println("Как заказывали! Все пары положительных целых чисел!");

  //      int countPairs = 0;

//        for (int i = 0; i <= valueNumber; i++) {
//            for (int j = 0; j <= valueNumber; j++) {
//                int multiplication = i * j;
//                if (multiplication == valueNumber) {
//                    System.out.println(i + " * " + j);
//                    countPairs++;
//                }
//            }
//
//   // System.out.println("Всего у нас "+ countPairs + " пар(ы) положительных целых чисел" );



        for ( int i =1 ; i <= valueNumber; i++) {

            if (valueNumber % i == 0) {
                int reminder = valueNumber / i;
                System.out.println(reminder +"*"+ i);
            }

            }
        }


    }








