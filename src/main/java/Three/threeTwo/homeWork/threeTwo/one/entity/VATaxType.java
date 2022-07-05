package Three.threeTwo.homeWork.threeTwo.one.entity;

public class VATaxType implements TaxType{

    @Override
    public double calculateTaxFor(double amount) {
        return amount*0.18;
    }
}
