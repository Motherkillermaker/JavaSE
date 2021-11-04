package OOP2.Interface;

/**
 * @author CJYong
 * @create 2021-05-30 15:48
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.9);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int compareValue = c1.compareTO(c2);

        if (compareValue > 0){
            System.out.println("c1对象大");
        }else if (compareValue < 0){
            System.out.println("c2对象大");
        }else {
            System.out.println("一样大");
        }

    }


}
