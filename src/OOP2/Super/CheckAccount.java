package OOP2.Super;

/**
 * @author CJYong
 * @create 2021-05-18 14:09
 */
public class CheckAccount extends Account {
     double overdraft;

    //构建空参构造器
    public CheckAccount(int id, double balance, double annualInterestRate, int overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        //余额足够消费
        if (balance >= amount) {
            balance -= amount;
            //透支额度 + 余额足够消费
        } else if (overdraft >= amount - balance) {
            overdraft -= amount - balance;
            balance = 0;
        }else {
            System.out.println("超过可透支限额 ！");
        }
    }

}


