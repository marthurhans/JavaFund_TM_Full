import java.util.Random;

public class GuessIt {



    public static void main(String[] args) {
        System.out.println();

        int num = ((int)(Math.random()*3+1));
        int randomNum = new Random().nextInt(5)+1;
        System.out.printf("Generated Number is: %d.%n", randomNum);
        System.out.println();

        if(randomNum <= 2) {
            System.out.println("The color is YELLOW");
        } else if(randomNum >= 4 && (randomNum % 2 == 0)) {
            System.out.println("The color is ORANGE");
        } else {
            System.out.println("The color is BROWN");
        }

        switch (randomNum) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is BLUE");
                break;
            case 3:
                System.out.println("The color is GREEN");
                break;
            case 4:
                System.out.println("The color is PURPLE");
                break;
            default:
                System.out.println("The color is Whatever");
        }

        String command = "go";

        switch(command) {
            case "stop":
                System.out.println("Going...");
                break;
            case "go":
                System.out.println("Stopping");
            default:
                System.out.println("Dunno");
        }

        if ("stop".equals(command)) {
            System.out.println("stopping now...");
        } else if ("go".equals(command)) {
            System.out.println("Going now...");
        }


    }

    private static boolean shouldIGo() {
        return true;
    }
}
