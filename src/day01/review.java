package day01;

import java.util.Scanner;

/**
 * @author CJYong
 * @create 2021-05-13 11:55
 */
public class review {
    public static void main(String[] args) {
        //获取两个整数的较大值（三元运算符）
        int m = 12;
        int n = 5;

        int max = (m > n) ? m : n;
        System.out.println(max);

        //从控制台获取不同类型的变量
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("请输入你的姓名：");
//        String name = scan.next();
//        System.out.println("你的姓名为：" + name);
//
//        System.out.println("请输入你的芳龄：");
//        int age = scan.nextInt();
//        System.out.println("你的年龄为：" + age);

        // for循环回顾
        for (int i = 1; i < 6; i++) {
            System.out.println("我每天都爱您 ！");
        }

        //  数组回顾
        int ids[];
        ids = new int[]{1001, 1002, 1003, 1004};   //静态初始化
        int[] names = new int[5];
        for (int i = 0; i < ids.length; i++) {  //遍历数组
            System.out.println(ids[i]);
        }
        System.out.println("**********************************************");

        // 冒泡排序
        int[] arr = new int[]{43, 52, -87, 12, 985, 1212, -789, 102, 2222, 459, -85, -63};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        System.out.println("***********************************************");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
