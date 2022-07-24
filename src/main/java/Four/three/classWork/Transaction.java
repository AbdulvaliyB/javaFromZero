package Four.three.classWork;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transaction {

    private final Account source;
    private final Account destination;
    private final int transferMoney;

    public void execute() {

        if (transferMoney > source.getMoney()) {
            System.out.printf("Недостаточно средств на счету %s (нужно %d долларов)\n", source, transferMoney);
            return;
        }
        source.setMoney(
                source.getMoney() - transferMoney
        );
        destination.setMoney(
                destination.getMoney() + transferMoney
        );
        System.out.printf("%d со %s счета на счет %s успешно переведены!\n", transferMoney, source, destination);
    }

}
