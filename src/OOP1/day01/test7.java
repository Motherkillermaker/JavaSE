package OOP1.day01;
//test7的改进
//
public class test7 {
	public static void main(String[] args) {
		Student2[] stus = new Student2[20]; //创建对象数组
		//创建对象
		for(int i = 0;i < stus.length;i++){
			stus[i] = new Student2();
			//给对象的属性赋值
			stus[i].number = i + 1;
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1); //随机数公式（b - a + 1）+ a
			stus[i].score = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		test7 test = new test7();
		
		//遍历学生数组
		test.print(stus);
		
		//1.打印出三年级的学生信息
		test.findState(stus, 3);
		
		//2.使用冒泡排序按学生成绩排序，并遍历所有学生信息
		//2.1冒泡排序
		test.sort(stus);
		//2.2遍历
		test.print(stus);
		
		System.out.println("***********************************");

			
	}
	/**
	 * 遍历学生数组
	 * @param stus
	 */
	//遍历学生数组
	public void print(Student2[] stus){
		for(int i = 0;i < stus.length;i++){
			System.out.println(stus[i].info());
		}		
	}
	/**
	 * 查找Student2中指定年级的学生信息
	 * @param stus	查找的数组
	 * @param state	要寻找的年级
	 */
	//查找年级为3的学生的信息
	public void findState(Student2[] stus,int state){
		for(int i = 0;i < stus.length;i++){
			if(stus[i].state == state){
				System.out.println(stus[i].info());
			}
		}
	}
	/**
	 * 给数组排序
	 * @param stus
	 */
	//排序
	public void sort(Student2[] stus){
		for(int i = 0;i < stus.length - 1;i++){
			for(int j = 0;j < stus.length - 1 -i;j++){
				if(stus[j].score > stus[j+1].score){
					//交换的为数组中的元素，即对象
					Student2 temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
		}
	}
	
	
}


class Student2{
	//属性
	int number;
	int state;
	int score;
	
	//方法
	public String info(){
		return "学号: " + number + " " + "年级： " + state + " " + "成绩： " + score; 
	}
}