import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число для подсчета факториала: ");

        int calcNumber = new Scanner(System.in).nextInt();
        BigInteger sum = BigInteger.valueOf (1);

        for (int i = 0; i < calcNumber; i++) {
            int countFactorial = i + 1;
            BigInteger countBigFactorial = BigInteger.valueOf(countFactorial);
            sum = sum.multiply(countBigFactorial);
            System.out.println(sum);
        }

        if (calcNumber > 0) {
            System.out.println("Факториал числа " + calcNumber + " равен " + sum);
        } else {
            System.out.println(" Введено отрицательное число ");
        }

    }
}

