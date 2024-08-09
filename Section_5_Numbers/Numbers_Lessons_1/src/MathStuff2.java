import java.security.SecureRandom;
import java.util.Random;

public class MathStuff2 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.1));
        int num1 = 3;
        int num2 = 5;
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.pow(num1, num2));
        System.out.println((int)(Math.random() * 10 + 1));
        System.out.println(Math.round(5.0));
        System.out.println(Math.round(5.3));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.7));
        System.out.println(Math.round(5.99));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println();

        Random random = new Random();
        System.out.println(random.nextInt(2));

        SecureRandom rando = new SecureRandom();
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
        System.out.println(rando.nextInt(10));
    }

}
