package Three.threeTwo.homeWork.threeTwo.one;

import Three.threeTwo.homeWork.threeTwo.one.entity.Bill;
import Three.threeTwo.homeWork.threeTwo.one.entity.IncomeTaxType;
import Three.threeTwo.homeWork.threeTwo.one.entity.ProgressiveTaxType;
import Three.threeTwo.homeWork.threeTwo.one.entity.VATaxType;
import Three.threeTwo.homeWork.threeTwo.one.service.TaxService;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(100000,new IncomeTaxType(),taxService),
                new Bill(100000,new VATaxType(),taxService),
                new Bill(100000,new ProgressiveTaxType(),taxService),
                new Bill(100001,new ProgressiveTaxType(),taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }

}
