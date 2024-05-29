import java.util.Scanner;

public class SwimmingPool {
    public static void main(String[] args) {
        System.out.print("Введите объеми бассейна: ");
        int volumeBath = new Scanner(System.in).nextInt();
        //int volumeBath = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int someMinutes = 0;

        while (volumeBath != 0) {

            if (volumeBath >= 20) {
                volumeBath -= fillingSpeed - devastationSpeed;
                someMinutes++;
                //System.out.println(volumeBath);
            } else break;
        }

        System.out.println("Нам нужно " + someMinutes + " минут чтобы заполнить бассейн");
    }

}


