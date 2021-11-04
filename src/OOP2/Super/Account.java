package OOP2.Super;

/**
 * @author CJYong
 * @create 2021-05-18 13:49
 */
public class Account {
    private int id;
    protected double balance;
    private  double  annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }
    //存钱
    public void withdraw (double amount){
        if (balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足 ！");
    }
    // 存钱
    public void deposit (double amount){
        if (amount > 0) {
            balance += amount;
            return;
        }
        System.out.println("请输入正确存钱金额 ！");
    }
}
