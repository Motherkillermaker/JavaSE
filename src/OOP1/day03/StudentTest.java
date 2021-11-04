package OOP1.day03;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("zhangsan",50);
		System.out.println(s1.name + s1.age + s1.school + s1.major);
		Student s2 = new Student("lisi",22,"yangtze university");
		System.out.println(s2.name + s2.age + s2.school + s2.major);
		Student s3 = new Student("wangwu",30,"cup","physical");
		System.out.println(s3.name + s3.age + s3.school + s3.major);
		
		
	}
}
