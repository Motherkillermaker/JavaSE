package OOP1.day04;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("罗密欧",21);
		boy.shout();
		
		Girl girl = new Girl("朱丽叶", 18);
		girl.marry(boy);
			
		Girl girl1 = new Girl("祝英台", 19);
		int compare = girl.compare(girl1);
		System.out.println(compare);
		
		
	}	
}
