import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

public class Question_6 {

    public static final NumberFormat moneyF = NumberFormat.getCurrencyInstance();

    public static void main(String[] args)  {
        System.out.println();
        String q6  = moneyF.format(new BigDecimal("149.32"));
        System.out.println(q6);

    }
}
