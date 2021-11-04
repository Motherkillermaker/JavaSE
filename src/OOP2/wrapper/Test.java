package OOP2.wrapper;

import OOP1.day03.TriAngle;

/**
 * @author CJYong
 * @create 2021-05-21 11:38
 */
public class Test {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int b1 =  (m == n) ? 3 : 5;
        System.out.println(b1);


        boolean t1 = true;
        Boolean t2 = t1;
        Object o1 = t2;         //  多态
        double answer = (o1 == t2) ? new Integer(1):new Double(2.0);   //  三元运算符
        System.out.println(answer);
    }
}
