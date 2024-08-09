import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoundInterestCalc {


    private static final NumberFormat moneyF = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentF = NumberFormat.getPercentInstance();

    public static BigDecimal calculate
            (String principal, String rate, int period, String contribution) throws ParseException {
        String rateAsPercent = percentF.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period);
//        BigDecimal b = a.multiply(new BigDecimal(period));
        BigDecimal c = a.subtract(BigDecimal.ONE);
        BigDecimal d = c.divide(new BigDecimal(rateAsPercent)); // ((1=r)Y-1/r
        BigDecimal e = d.multiply(new BigDecimal(moneyF.parse(contribution).toString())); // c[((1=r)Y-1/r]
        BigDecimal f = a.multiply(new BigDecimal(moneyF.parse(principal).toString()));
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("$#,###.##; -$#");
        DecimalFormat pf = new DecimalFormat("#%");
        BigDecimal balance = CompoundInterestCalc.calculate("$25,300", "8%", 10, "$7,500");
        System.out.println(df.format(balance.negate()));
        System.out.println(pf.format(2737.085));
        System.out.println(balance);
        String myMoney = String.format("$%,(.2f%n", balance.negate());
        System.out.printf("$%,(.2f%n", balance.negate());
        System.out.format(myMoney);
        System.out.println(myMoney);

    }


}
