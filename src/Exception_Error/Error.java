package Exception_Error;

/**
 * @author CJYong
 * @create 2021-05-31 12:49
 */
/*
Error：Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源
耗尽等严重情况。比如：StackOverflowError和OOM。一般不编写针对性
的代码进行处理。

 */
public class Error {
    public static void main(String[] args) {
        // 1. java.lang.StackOverflowError   栈溢出
//        main(args);
        // 2. java.lang.OutOfMemoryError     堆溢出
//        Integer[] arr = new Integer[1024*1024*1024];
    }
}
