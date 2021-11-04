package Project3.service;

/**
 * @author CJYong
 * @create 2021-06-03 16:50
 */
public class Status {
    // 枚举

    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    public String toString(){
        return NAME;
    }
}
