import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exchange_return {
    public static void main(String[] args) {

    }

    private static double getChange(double price, double amount) {
        BigDecimal temp = new BigDecimal(amount-price);
        return temp.setScale(1, RoundingMode.FLOOR).doubleValue();
    }
}
