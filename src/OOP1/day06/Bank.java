package OOP1.day06;

public class Bank {
	private Customer[] customers ; //存放多个客户的数字
	private int numberOfCustomer;
	
	public Bank(){	
		customers = new Customer[10];
	}
	//添加客户
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f,l);
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
		
	}
	//获取客户的个数
	public int getNumOfCustomer(){
		return numberOfCustomer;
	}
	//获取指定位置的客户
	public Customer getCustomer(int index){
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}
		return null;
	}

}
