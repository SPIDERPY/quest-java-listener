public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);
        
        Transaction.withdraw(account, 100, new TransactionListener() {
        @Override
        public void onComplete(Bank bank) {
            System.out.printf("Your balance is: %d%n",account.getTotal() - bank.getTotal());
        }
        });
    }
}


