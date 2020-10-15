package lock.reentrantLock.thread;

public class test1 {
    public static void main(String[] args) throws InterruptedException {
        thread1 thread1 = new thread1();
        thread1.setName("thread1");
        //通知线程规划器 此线程已经准备就绪 等待调用线程对象的run方法 如果直接调用thread的run方法
        //相当于没有把对象交给线程规划期 只是由main方法来调用run()方法而已 一值运行的也就是main线程
        //且start方法启动顺序并不代表线程执行顺序 线程执行的顺序在优先级相同的情况下是随机的
        thread1.start();
        for(int i=0;i<10;i++){
            int  random = (int)Math.random();
            Thread.sleep(random);
            System.out.println(Thread.currentThread().getName()+" is running ");
        }
    }
}
