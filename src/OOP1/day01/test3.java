package OOP1.day01;

public class test3 {
	public static void main(String[] args) {
		//创建Person对象
		Person p1 = new Person();
		Person p2 = new Person();
		
		//调用对象的属性和方法
		//属性
		p1.name = "zhangsan";
		p1.age = 15;
		p1.sex = 22;
		
		//方法
		p1.study();
		p1.showAge();
		p1.addAge();
	}
}





class Person{
	//属性
	String name;
	int age;
	int sex;
	
	//方法
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println("your age is " + age);
	}
	
	public void addAge(){
		int newage = age + 2; 
		System.out.println("your age now is " + newage); 
	}
}
