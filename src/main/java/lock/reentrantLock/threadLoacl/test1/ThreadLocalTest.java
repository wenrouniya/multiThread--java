package lock.reentrantLock.threadLoacl.test1;

/**
 * 验证ThreadLocal的隔离性
 */
public class ThreadLocalTest {

    public static ThreadLocal tl=new ThreadLocal<String >();

    public  static  String  get(){
        return (String) tl.get();
    }

    public static  void set(String i){
        tl.set(i);
    }
}

