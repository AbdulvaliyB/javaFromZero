package Three.two.homeWork.two.one.entity;

public class ProgressiveTaxType implements TaxType{

    @Override
    public double calculateTaxFor(double amount) {
        if(amount<=100000){
            return amount*0.10;
        }
        return amount*0.15;
    }
}
