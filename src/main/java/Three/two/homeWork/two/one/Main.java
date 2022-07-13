package Three.two.homeWork.two.one;

import Three.two.homeWork.two.one.entity.Bill;
import Three.two.homeWork.two.one.entity.IncomeTaxType;
import Three.two.homeWork.two.one.entity.ProgressiveTaxType;
import Three.two.homeWork.two.one.entity.VATaxType;
import Three.two.homeWork.two.one.service.TaxService;

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
