package Four.three.classWork;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(new ArrayDeque<>());


        Account accountVasya = new Account("127893456","A",3412);
        Account accountSerega = new Account("789023445","B",1635);
        Account accountPetya = new Account("750236560","C",2441);


        addTransactionToBank(bank,accountPetya,accountSerega,200);
        addTransactionToBank(bank,accountSerega,accountVasya,100);
        addTransactionToBank(bank,accountVasya,accountPetya,400);
        addTransactionToBank(bank,accountVasya,accountSerega,4000);

        bank.executeAllTransactions();


    }

    private static void addTransactionToBank(Bank bank, Account source, Account destination, int money) {
    bank.addTransaction(new Transaction(source,destination,money));
    }
}
