package Three.threeTwo.homeWork.threeTwo.two;


import Three.threeTwo.homeWork.threeTwo.two.entity.Bill;
import Three.threeTwo.homeWork.threeTwo.two.entity.IncomeTaxType;
import Three.threeTwo.homeWork.threeTwo.two.entity.ProgressiveTaxType;
import Three.threeTwo.homeWork.threeTwo.two.entity.VATaxType;
import Three.threeTwo.homeWork.threeTwo.two.service.TaxService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        BigDecimal money= BigDecimal.valueOf(100000);
        Bill[] payments = new Bill[]{
                new Bill(money,new IncomeTaxType(),taxService),
                new Bill(money,new VATaxType(),taxService),
                new Bill(money,new ProgressiveTaxType(),taxService),
                new Bill(money.add(BigDecimal.valueOf(1)),new ProgressiveTaxType(),taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
