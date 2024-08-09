import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathStuff3 {

    public static void main(String[] args) {
        System.out.println();
        int num1 = 3;
        int num2 = 3;
        System.out.println(num1 == num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 != num2);

        float num3 = 2.15f;
        float num4 = 1.10f;
        System.out.println(num3 -num4);

        BigDecimal numA = new BigDecimal("2.15");
        BigDecimal numB = new BigDecimal("1.10");
        System.out.println(numA.subtract(numB));
        System.out.println();

        System.out.println(new BigDecimal(".3145683").add(new BigDecimal("5.321")));
        System.out.println(new BigDecimal(".3145683").subtract(new BigDecimal("5.321")));
        System.out.println(new BigDecimal(".3145683").multiply(new BigDecimal("5.321")));

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal(".3145683").divide(new BigDecimal("5.321"), mc));
        System.out.println();


        System.out.println(new BigDecimal(".3145683").divide
                (new BigDecimal("5.321"), 5 ,RoundingMode.HALF_UP));
        System.out.println();

        System.out.println(new BigDecimal(".054798").sqrt(mc));
        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("7").min(new BigDecimal("13")));
        System.out.println();

        System.out.println(new BigDecimal("13").remainder(new BigDecimal(8)));










    }
}
