package Four.three.classWork;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Bank {
    Queue<Transaction> transactionCache;

    public void executeAllTransactions() {
        while (transactionCache.peek() != null) {
            transactionCache.poll().execute();
        }
    }

    public void addTransaction(Transaction transaction){
        transactionCache.offer(transaction);
    }
}
