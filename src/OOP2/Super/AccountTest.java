package OOP2.Super;

/**
 * @author CJYong
 * @create 2021-05-18 14:03
 */

/*
写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利
率。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        System.out.println("您的余额为：" + account.getBalance());

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的余额为：" + account.getBalance());
        System.out.println("月利率为：" + account.getMonthlyInterest());
        System.out.println("****************************************");

        CheckAccount acc = new CheckAccount(1122,20000,0.045,5000);
        acc.withdraw(5000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.overdraft);
        System.out.println();

        acc.withdraw(18000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.overdraft);
        System.out.println();

        acc.withdraw(3000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("您的可透支余额为：" + acc.overdraft);

    }
}
