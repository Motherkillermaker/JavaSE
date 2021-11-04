package OOP1.day02;

public class test1 {
	public static void main(String[] args) {
		//创建Circle对象
		Circle r1 = new Circle();
		
		//调用对象的属性和方法
		//属性
		r1.r = 2;
		
		//方法
		double s = r1.area();
		System.out.println("the area is " + s);
		
		//创建PassObject对象
		PassObject p1 = new PassObject();
		//调用方法
		p1.printAreas(r1,20);
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

class PassObject{
	public void printAreas(Circle c,int time){ 		//将类作为形参(注：此时传递的是地址值)
		System.out.println("R\t\tArea");
		Circle[] circles = new Circle[time];		//创建类的数组
		for(int i = 0;i < time;i++){
			circles[i] = new Circle();				//创建对象（）
			circles[i].r = i + 1;					//给属性赋值
			System.out.println((i + 1 ) + "\t\t" + circles[i].area());
		}
		System.out.println("now the r is " + (time + 1));
	}
}


