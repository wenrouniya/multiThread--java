package lock.reentrantLock.thread;

public class Yield  extends  Thread{

    @Override
    public void run() {

        long startTime =System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            Thread.yield();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("cost time = " +(endTime -startTime));
    }

    public static void main(String[] args) {
        Yield yield = new Yield();
        yield.start();
    }
}
