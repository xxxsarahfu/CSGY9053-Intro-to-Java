/**
 * Fu-Hsuan Liu
 * fl1392@nyu.edu
 * Assignment 3, question 1
 * Mar 06 2020
 * 2 hrs
 * This is a bank system project including main test file, 
 * Bank (arraylist for accounts), BankAccount (base) and 
 * SavingsAccount (derived), CurrentAccount (derived) classes.
 * This program shows account actions such as deposit, withdraw, 
 * update, open, close, etc. and provides some toString overrides.
*/
import static java.lang.System.out;
class Test {
    public static void main(String args[]) {
        out.println("\n==================== TEST 1 ====================");
        out.println("• Create simple Bank Accounts:");
        BankAccount acc = new BankAccount(0);
        CurrentAccount acc1 = new CurrentAccount(1,20);
        SavingsAccount acc2 = new SavingsAccount(2,20);
        out.println(acc);
        out.println(acc1);
        out.println(acc2);
        out.println("\n• Deposit 200 and withdraw 50 for Account 0... ");
        acc.deposit(200);
        acc.withdraw(50);
        out.println(acc);
        out.println("\n• Deposit -100 for Account 1... ");
        acc1.deposit(-100);

        out.println("\n==================== TEST 2 ====================");
        out.println("\n• A Bank initially has 4 accounts: (2 savings, 2 current): ");
        Bank bank = new Bank();
        out.println(bank);
        out.println("• Open a Savings Account 4... ");
        SavingsAccount acc4 = new SavingsAccount(4, 5); // create a savings account with id 4, interest 5
        bank.openAcc(acc4);
        out.println("\n• Open a Current Account 7 then withdraw 600 dollars... ");
        CurrentAccount acc7 = new CurrentAccount(7, 500); // create a current account with id 7, overdraft limit 500
        bank.openAcc(acc7);
        acc7.withdraw(600); 
        out.println(bank);
        out.println("• Close Account 1 and 3... ");
        bank.closeAcc(1);
        bank.closeAcc(3);
        out.println("\n• Update all Accounts (1st)... ");
        bank.update();
        out.println("\n• Devide 1000 and pay to existing accounts...");
        bank.dividePay(1000);
        out.println(bank);
        out.println("• Update all Accounts (2nd)... ");
        bank.update();
    }
}