package OOP2.ABSTRACT;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author CJYong
 * @create 2021-05-30 13:39
 */
/*
（5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
型,name,number,birthday。当键盘输入本月月份值时，如果本
月是某个Employee对象的生日，还要输出增加工资信息。
提示：
//定义People类型的数组People c1[]=new People[10];
//数组元素赋值
c1[0]=new People("John","0001",20);
c1[1]=new People("Bob","0002",19);
//若People有两个子类Student和Officer，则数组元素赋值时，
可以使父类类型的数组元素指向子类。
c1[0]=new Student("John","0001",20,85.0);
c1[1]=new Officer("Bob","0002",19,90.5);
 */
public class PayrollSystem {
    public static void main(String[] args) {
        // 方式一
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出当前的月份：");
        int month = scanner.nextInt();

        //方式二
//        Calendar calendar = Calendar.getInstance();
//        int month = calendar.get(calendar.month);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("马森",1002,new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("张杰",2001,new MyDate(1991,5,27),60,240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为: " + salary);

            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！ 奖励100元");
            }
        }
    }

}
