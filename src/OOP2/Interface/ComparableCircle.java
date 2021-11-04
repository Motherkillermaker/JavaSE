package OOP2.Interface;

/**
 * @author CJYong
 * @create 2021-05-30 15:36
 */
/*
定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
径大小。
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTO(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            //方式一
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else if (this.getRadius() < c.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }
            //方式二
            return this.getRadius().compareTo(c.getRadius());
        }else {
           // return 0;
            throw new RuntimeException("传入的数据类型不匹配 ！");
        }
    }
}
