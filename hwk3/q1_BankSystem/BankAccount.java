public class BankAccount {
    private int acc_num;
    private double acc_bal;
    
    BankAccount(int number) {
        this.acc_num = number;
        this.acc_bal = 0;
    }

    public int getAccNumber () {
        return this.acc_num;
    }

    public double getAccBalance () {
        return this.acc_bal;
    }

    public void deposit (double amount) {
        if (amount < 0) {
            System.out.println("Depoosit amount cannot be negative! "); 
            return;
        }
        this.acc_bal += amount;
    }

    public void withdraw (double amount) {
        // assert amount <= 0 : " withdraw amount"; 
        if (amount < 0) {
            System.out.println("Withdraw amount cannot be negative! "); 
            return;
        }
        this.acc_bal -= amount;
    }

    @Override
    public String toString() {
        return ("Account " + acc_num + " has balance " + acc_bal + ".");
    }
}




