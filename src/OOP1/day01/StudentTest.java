package OOP1.day01;

public class StudentTest {
	public static void main(String[] args) {
		//创建Student对象
		Student s1 = new Student();
		Student s2 = new Student();
		
		//调用对象的属性和方法
		//属性
		s1.name = "zhangsan";
		s1.age = 22;
		s1.major = "physical";
		s1.interests = "playing football";
		s2.name = "wangwu";
		s2.age = 35;
		s2.major = "art";
		s2.interests = "pingpang";
			
		//方法
		String info1 = s1.say();
		System.out.println(info1);
		String info2 = s2.say();
		System.out.println(info2);
	}
}




class Student{
	//属性
	String name;
	int age;
	String major;
	String interests;
	
	//方法
	public String say(){
		String info = "my name is " + name + ","
			+  "my age is " + age + ","
			+ "my major is " + major +","
			+ "my interests is " + interests;
		return info;
	}
}
