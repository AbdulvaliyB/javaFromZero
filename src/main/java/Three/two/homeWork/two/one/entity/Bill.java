package Three.two.homeWork.two.one.entity;

import Three.two.homeWork.two.one.service.TaxService;

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
