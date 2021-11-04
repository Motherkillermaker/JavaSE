package Exception_Error;

/**
 * @author CJYong
 * @create 2021-06-01 15:21
 */

/*
    自定义异常类
 */
public class EcDef extends Exception{
     static final long serialVersionUID = -3387593124229948L;

     public EcDef(String msg){
         super(msg);
     }
}
