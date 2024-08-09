import java.math.BigDecimal;
import java.math.BigInteger;

public class MathStuff4 {

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("3");
        byte b = num1.byteValue();
        System.out.println(b);

        BigDecimal num2 = new BigDecimal("1024.334");
        String myString = num2.toString();
        System.out.println(myString);

        BigInteger myInt = new BigInteger("1729894238635928598298562987986798698");
        System.out.println(myInt);
    }
}
