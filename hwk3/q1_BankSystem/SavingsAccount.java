public class SavingsAccount extends BankAccount{
    private double interest;
    SavingsAccount(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public void addInterest() {
        this.deposit(this.interest);
    }

    @Override
    public String toString() {
        return ("Account " + this.getAccNumber() + " has balance " + this.getAccBalance() + ", interest " + this.interest);
    }
}