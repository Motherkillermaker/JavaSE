package OOP1.day01;

public class test6 {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20];
		//创建对象
		for(int i = 0;i < stus.length;i++){
			stus[i] = new Student1();
			//给对象的属性赋值
			stus[i].number = i + 1;
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1); //随机数公式（b - a + 1）+ a
			stus[i].score = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		//遍历学生数组
		for(int i = 0;i < stus.length;i++){
			System.out.println(stus[i].info());
		}
		System.out.println("***********************************");
		
		//1.打印出三年级的学生信息
		for(int i = 0;i < stus.length;i++){
			if(stus[i].state == 3){
				System.out.println(stus[i].info());
			}
		}
		System.out.println("***********************************");
		
		//2.使用冒泡排序按学生成绩排序，并遍历所有学生信息
		//2.1冒泡排序
		for(int i = 0;i < stus.length - 1;i++){
			for(int j = 0;j < stus.length - 1 -i;j++){
				if(stus[j].score > stus[j+1].score){
					//交换的为数组中的元素，即对象
					Student1 temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
		}
		//2.2遍历
		for(int i = 0;i < stus.length;i++){
			System.out.println(stus[i].info());
		}
		System.out.println("***********************************");

		
		
	}
}


class Student1{
	//属性
	int number;
	int state;
	int score;
	
	//方法
	public String info(){
		return "学号: " + number + " " + "年级： " + state + " " + "成绩： " + score; 
	}
}