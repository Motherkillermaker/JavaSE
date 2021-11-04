package OOP1.day01;

public class test5 {
	public static void main(String[] args) {
		test5 test = new test5(); //创建对象
		
	//	test.method();			  //调用方法
	//	int area = test.method();
	//	System.out.println(area);
		System.out.println(test.method(12, 10));
		
	}
/*	方法一：
	public void method(){
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 8;j++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
*/	
	
/*	
	//方法二：
	public int method(){
		for(int i = 0;i < 10;i++){
			for(int j = 0;j<8;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		return 10*8;
	}
*/
	
	//方法三：
	public int method(int m,int n){
		for(int i = 0;i < m;i++){
			for(int j = 0;j < m;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
	
}
 