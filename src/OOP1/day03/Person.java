package OOP1.day03;

public class Person {

		private int age;
		
		public void setAge(int a){
			if( a < 0 || a > 130){
				System.out.println("传入数据非法");
			}else{
				age = a;
			}
		}
		
		public int getAge(){
			return age;
		}
}
