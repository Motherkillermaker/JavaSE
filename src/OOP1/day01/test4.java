package OOP1.day01;

public class test4 {
	public static void main(String[] args) {
		//创建Circle对象
		Circle r1 = new Circle();
		
		//调用对象的属性和方法
		//属性
		r1.r = 2;
		
		//方法
		double s = r1.area();
		System.out.println("the area is " + s);
	}
}



class Circle{
	//属性
	double r;
	
	//方法
	public double area(){
		double s = (Math.PI)*r*r;
		return s;
	}
}



