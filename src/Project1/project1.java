package Project1;
class project1{
	public static void main(String[] args) {
		
		boolean isFlag = true;
		//用于记录用户的收入和支出的详情
		String details = "收支\t账户金额\t收支金额\t说   明\n";
		//初始金额
		int balance = 10000;

		while(isFlag){
		
			System.out.println("--------------收支记账软件-------------------\n");
			System.out.println("                  1.收支明细");
			System.out.println("                  2.登记收入");
			System.out.println("                  3.登记支出");
			System.out.println("                  4.退    出\n");
			System.out.println("                  请选择<1-4>：");
			//获取用户选择
			char selection = Utility.readMenuSelection();
			switch(selection){
			
			case '1':
				//System.out.println("1.收支明细");
			System.out.println("--------------当前收支明细记录-----------------");	
			System.out.println(details);			
			System.out.println("-----------------------------------------------");	
				break;
			
			case '2':
				//System.out.println("2.登记收入");
				System.out.print("本次收入金额：");	
				int addmoney = Utility.readNumber();
				System.out.print("本次收入说明：");	
				String addinfo = Utility.readString();
				
				//处理balance
				balance += addmoney;

				//处理details
				details += ("收入\t" + balance + "\t\t" + addmoney + "\t\t" + addinfo + "\n");
				System.out.println("-------------------------登记完成-------------------------\n");		
				break;
			
			case '3':
				//System.out.println("3.登记支出");
				System.out.print("本次支出金额：");	
				int outmoney = Utility.readNumber();
				System.out.print("本次支出说明：");	
				String outinfo = Utility.readString();

				//处理balance
				if(balance >= outmoney){
					balance -= outmoney;
					
					//处理details
					details += ("支出\t" + balance + "\t\t" + outmoney + "\t\t" + outinfo + "\n");		
				}else{
					System.out.println("支出超出账户额度，支付失败");
					}
				System.out.println("-------------------------登记完成-------------------------\n");		
				break;
			
			case '4':
				//System.out.println("4.退出");
				System.out.print("确认是否退出(Y/N):");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
				//break;
			}
			//isFlag = false;
		}
	}
}
