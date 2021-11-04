package Project3.service;

/**
 * @author CJYong
 * @create 2021-06-03 20:00
 */

/*
        自定义异常类
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387993124229948L;

    public TeamException(){

    }

    public TeamException(String msg){
        super(msg);
    }
}
