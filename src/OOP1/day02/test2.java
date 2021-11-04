package OOP1.day02;
//递归调用（了解）
public class test2 {
	
	//1.计算所有自然数的和
	public static void main(String[] args) {
		test2 test = new test2();
		System.out.println(test.getSum(100));
	}

	//计算和
	public int getSum(int n){
		if(n == 1){
			return 1;
		}else{
			return n + getSum( n -1 );
		}
	}
		
}




