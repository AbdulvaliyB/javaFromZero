package Three.two.homeWork.two.one.entity;

public class VATaxType implements TaxType{

    @Override
    public double calculateTaxFor(double amount) {
        return amount*0.18;
    }
}
