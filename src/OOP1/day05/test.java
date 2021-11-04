/*
3.写一个测试程序。
（1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
年利率为 1.23％ 的账户。
（2） 对 Jane Smith 操作。
存入 100 元，再取出 960 元。再取出 2000 元。
打印出 Jane Smith 的基本信息
*/

package OOP1.day05;

public class test {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane","Smith");
		
		Account acct = new Account(1000,2000,0.0123);
		  
		cust.setAccount(acct);
		
		cust.getAccount().deposit(100);
		
		cust.getAccount().withdraw(960);
		
		cust.getAccount().withdraw(2000);
		
		System.out.println("Customer " + cust.getFirstName() + cust.getLastName() 
						+ " has a account: id is " + cust.getAccount().getId() + "," + "annualInterestRate is " 
						+ cust.getAccount().getAnnualInterestRate() * 100 + "%" +"," + "balance is " + cust.getAccount().getBalance());
		
	}
	
	
}
