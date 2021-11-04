package OOP1.day06;

public class test {
     public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("客户" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
		
		System.out.println("*******************************");
		
		bank.addCustomer("万里", "杨");
		
		System.out.println("客户个数为：" + bank.getNumOfCustomer());
	}
	
}
