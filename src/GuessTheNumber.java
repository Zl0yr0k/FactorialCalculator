import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int value = new Random().nextInt(100);

        while (true) {
            System.out.print("Введи число: ");
            int valueNumberOfGuess = new Scanner(System.in).nextInt();
            if (valueNumberOfGuess > value) {
                System.out.println("Введи значение меньше");
            } else if (valueNumberOfGuess < value) {
                System.out.println("Введи значение больше");
            } else {
                System.out.println("Ты угадал!Это правильно");
                break;
            }
        }


    }
}
