package Three.threeTwo.homeWork.threeTwo.two.entity;

import java.math.BigDecimal;

public class IncomeTaxType implements TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return BigDecimal.valueOf(0.13).multiply(amount);
    }
}
