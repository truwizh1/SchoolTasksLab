import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculationBigDecimal {
    public static void main(String[] args) {
        BigDecimal priceNet = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");
        BigDecimal oneHundred = new BigDecimal("10000");
        BigDecimal priceGross = priceNet.add(priceNet.multiply(vatRate));
        BigDecimal totalGross = priceGross.multiply(oneHundred);
        BigDecimal totalNet = totalGross.divide(vatRate.add(BigDecimal.ONE), 2, RoundingMode.HALF_UP);

        System.out.println("\nUsing BigDecimal:");
        System.out.println("Gross price of one product: " + priceGross);
        System.out.println("Total gross for 10,000 products: " + totalGross);
        System.out.println("Total net for 10,000 products (calculated from gross): " + totalNet);
    }
}

