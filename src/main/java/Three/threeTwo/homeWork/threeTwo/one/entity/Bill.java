package Three.threeTwo.homeWork.threeTwo.one.entity;

import Three.threeTwo.homeWork.threeTwo.one.service.TaxService;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {

        double taxAmount = taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }
}
