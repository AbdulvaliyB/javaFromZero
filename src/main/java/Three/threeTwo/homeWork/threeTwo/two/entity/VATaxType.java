package Three.threeTwo.homeWork.threeTwo.two.entity;

import java.math.BigDecimal;

public class VATaxType implements TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return BigDecimal.valueOf(0.18).multiply(amount);
    }
}
