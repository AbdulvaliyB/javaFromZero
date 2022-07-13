package Three.two.homeWork.two.two;


import Three.two.homeWork.two.two.entity.Bill;
import Three.two.homeWork.two.two.entity.IncomeTaxType;
import Three.two.homeWork.two.two.entity.ProgressiveTaxType;
import Three.two.homeWork.two.two.entity.VATaxType;
import Three.two.homeWork.two.two.service.TaxService;

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
