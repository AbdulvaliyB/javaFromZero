package Three.two.homeWork.two.two.entity;

import java.math.BigDecimal;

public class ProgressiveTaxType implements TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(100000))>0){
            return BigDecimal.valueOf(0.15).multiply(amount);
        }
        return BigDecimal.valueOf(0.10).multiply(amount);
    }
}
