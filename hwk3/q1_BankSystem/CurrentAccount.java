public class CurrentAccount extends BankAccount {
    private double overDraftLimit;
    CurrentAccount(int number, double overDraftLimit) {
        super(number);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return this.overDraftLimit;
    }

    @Override
    public String toString() {
        return ("Account " + super.getAccNumber() + " has balance " + super.getAccBalance() + ", Overdraft limit " + this.overDraftLimit);
    }
}