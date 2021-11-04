package OOP2.DuoTai;

/**
 * @author CJYong
 * @create 2021-05-19 18:09
 */
public class CylinderTest {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setRadius(2);
        System.out.println(cir.getRadius());
        System.out.println(cir.findArea());
        System.out.println("*******************************");


        Cylinder cy = new Cylinder(1,3);
        System.out.println(cy.getRadius());
        System.out.println(cy.getLength());
        System.out.println(cy.findArea());
        System.out.println(cy.findVolume());
    }
}
