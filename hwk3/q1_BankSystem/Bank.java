import java.util.ArrayList;
import java.util.List;
public class Bank {
    // for pratical usage, design a dynamic arraylist instead of fixed size array
    private List<Object> testAccs = new ArrayList <Object>();

    Bank() { 
        testAccs.add(new SavingsAccount(0, 10));
        testAccs.add(new SavingsAccount(1, 20));
        testAccs.add(new CurrentAccount(2, 100));
        testAccs.add(new CurrentAccount(3, 200));
    }

    public void update() {
        for (int i = 0; i < testAccs.size(); i++) {
            if (testAccs.get(i).getClass().getName() == "SavingsAccount") {
                ((SavingsAccount) testAccs.get(i)).addInterest();
            }
            else {
                double overdraft = ((CurrentAccount) testAccs.get(i)).getOverDraftLimit();
                double balance = ((CurrentAccount) testAccs.get(i)).getAccBalance();
                if (balance < -overdraft) {
                    System.out.println("An overdraft letter is sent to Account " + ((CurrentAccount) testAccs.get(i)).getAccNumber() + "!");
                }
            }
            System.out.println(((BankAccount) testAccs.get(i)));
        }
    }

    public void openAcc(Object newAcc) {
        testAccs.add(newAcc);
    }

    public void closeAcc(int number) {
        for (int i = 0; i < testAccs.size(); i++) {
            if (((BankAccount) testAccs.get(i)).getAccNumber() == number) 
                testAccs.remove(i);
        }
    }

    public void dividePay(double pay) {
        int n = testAccs.size();
        pay /= n;
        for (int i = 0; i < n; i++) {
            ((BankAccount) testAccs.get(i)).deposit(pay);
        }
    }

    @Override 
    public String toString() {
        String str = "";
        for (int i = 0; i < testAccs.size(); i++) {
            int id = ((BankAccount)testAccs.get(i)).getAccNumber();
            double bal = ((BankAccount)testAccs.get(i)).getAccBalance();
            String tmp = String.format("Account " + id + " has balance " + bal + "\n");
            str += tmp;
        }
        return str;
    }
} 