import java.util.Timer;
import java.util.TimerTask;

public class Transaction {
    

    public static void withdraw(Bank account, int i, TransactionListener transactionListener) {
        
        int time = (int) (Math.random() * ((1000 - 500) + 1) + 500);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Bank bank = new Bank(i);
                transactionListener.onComplete(bank); 
            } 
        }, time);
    }
}

