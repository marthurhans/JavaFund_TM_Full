import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    private int sum = 0;

    public static void main(String[] args) throws ParseException {
        //QUESTION 1
        // Let H    G    F    E    D    C    B    A  -  be assigned values
        //    128   64   32   16   8    4    2    1
        int signalABC = 1 | 2 | 4; // 7
        int signalAD = 1 | 8; // 9
        int signalADC = 1 | 8 | 4; // 13

        // test if signal D is present in ADC
        System.out.println((13 & 8) == 8); // Logical AND of original
        // signal (13) AND 'D' (8) will equal
        // 8 IF and only IF 'D' was present in original signal
        // 13's D AND 8's D have to align?
        //
        // 64 in bits -->
        //0 0 0 0 1 1 0 1 = 13
        //H G F E D C B A
        //0 0 0 0 1 0 0 0 = 8
        //Is D triggered (lined up with '13')('on')? Answer TRUE!
        System.out.println((64 & 8) == 8);
        // 64 in bits -->
        //0 1 0 0 0 0 0 0 = 64
        //H G F E D C B A
        //0 0 0 0 1 0 0 0 = 8
        //Is D triggered ('on')? Answer FALSE!
        System.out.println((222 & 8) == 8);
        // 222 in bits -->
        //1 1 0 1 1 1 1 0 = 222
        //H G F E D C B A
        //0 0 0 0 0 1 0 0 = 8
        //Is D triggered ('on')? Answer TRUE!
        System.out.println();

        //QUESTION 2
        System.out.println(4 | 2);
        //0 0 0 0 0 1 0 0
        //0 0 0 0 0 0 1 0
        //---------------
        //0 0 0 0 0 1 1 0
        System.out.println();

        //QUESTION 5
        Main main = new Main();
        for (int i = 0; i < 10; i++) {
            System.out.println("New total: " + main.next());
        }
        System.out.println();

        //QUESTION 7

        Number value = NumberFormat.getCurrencyInstance().parse("$12,345.83");
        System.out.println(value);
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);

        System.out.println(result);// Used MathContext.DECIMAL32 above so I wouldn't have to create one myself. Chose 32 instead of the others
        // because it was the smallest one, in terms of precision.
        System.out.println(NumberFormat.getCurrencyInstance().format(result));
        System.out.println();

        //QUESTION 8
        System.out.printf("$%,.2f%n",123456.783);
        Double d = Double.valueOf(-9876.32532);
        System.out.printf("%,(.3f%n",-9876.32532);
        System.out.printf("%ef%n",23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf("%,.1f%n", -9876.35532);
        System.out.println();

        //QUESTION 9
        String v1 = String.format("$%,.2f%n", 123456.783);
        String v2 = String.format("%,(.3f%n", -9876.32532);
        String v3 = String.format("%ef%n", 23.19283928394829182);
        String v4 = String.format("%010d%n", 123456);
        String v5 = String.format("%,+.1f%n", -9876.35532);

        System.out.print(v1);
        System.out.print(v2);
        System.out.print(v3);
        System.out.print(v4);
        System.out.print(v5);
        System.out.println();

        //QUESTION 10
        System.out.println(new DecimalFormat("$#,###.##").format(123456.783));
        System.out.println(new DecimalFormat(",###.##; (#)").format(-9876.32532));
        System.out.println(new DecimalFormat("0.######E00f").format(23.19283928394829182));
        System.out.println(new DecimalFormat("0000000000").format(123456));
        System.out.println(new DecimalFormat("#,###.#; -").format(-9876.35532));

        //QUESTION 11
        System.out.println(sumStrings("37","13"));



    }

    //QUESTION_5_METHOD
    public int next() {
        int rando = (int)(Math.random()*10);
        System.out.println("Random #: " + rando);
        sum += rando;
        return sum;
    }

    //QUESTION 11 METHOD
    public static int sumStrings (String num1, String num2) {
        return (Integer.parseInt(num1)) + (Integer.parseInt(num2));
    }

}