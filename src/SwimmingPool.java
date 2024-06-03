import java.util.Scanner;

public class SwimmingPool {
    public static void main(String[] args) {

        int switchON = -1;
        while ( switchON != 0) {
            System.out.print("Введите объеми бассейна: ");
            int volumeBath = new Scanner(System.in).nextInt();
            System.out.println("Введите значение потока воды для заполнения бассейна");
            int fillingSpeed = new Scanner(System.in).nextInt(); //30 litres per minute
            System.out.println("Введите значение потока слмва воды из бассейна");
            int devastationSpeed = new Scanner(System.in).nextInt(); //10 litres per minute
            int someMinutes = 0;

            while (volumeBath > 0) {

                if (fillingSpeed > devastationSpeed) {
                    volumeBath -= fillingSpeed - devastationSpeed;
                    someMinutes++;
                    //System.out.println(volumeBath);
                } else {
                    System.out.println("Не достаточный поток воды для наполенния бассейна");
                    break;
                }

            }

            System.out.println("Нам нужно " + someMinutes + " минут чтобы заполнить бассейн");
            System.out.println("Желаете продолжить? Введите любое число в ином случае введите 0");
            switchON = new Scanner(System.in).nextInt();

        }

    }

}


