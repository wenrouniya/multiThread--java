package lock.reentrantLock.thread.test9;

public class Tools {

    private volatile  boolean isPrintA= true;
    public volatile static  int  num =0;

    //这里的sychronized锁住的使调用这个方法的对象 即Main中创建的tools
    //两个线程都是用同一个对象去调用方法 保证调用方法时 是顺序执行的
    synchronized  public  void printA() throws InterruptedException {
        //while条件是让线程阻塞在这个循环里
        // 如果使用if 变量isPrintA 很可能还没切换 就又去notify了
        // 多个呈wait的线程被唤醒 可能会在后面的逻辑中出现异常
        while(!isPrintA){
            //这里相当于this.wait() 省略了this
            wait();
        }
        System.out.println(++num);
        isPrintA =false;
        notifyAll();
    }

    synchronized  public void  printB() throws InterruptedException {
        while ( isPrintA){
            wait();
        }
        System.out.println(++num);
        isPrintA =true;
        notifyAll();
    }


}
