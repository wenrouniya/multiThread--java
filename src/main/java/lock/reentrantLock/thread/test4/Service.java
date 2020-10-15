package lock.reentrantLock.thread.test4;

public class Service {

    private boolean isRun =true;

    public void  runMethod(){
        while ( isRun ==true){

        }
        System.out.println("方法停止运行");
    }

    public  void stopMethod(){
        isRun =false;
    }
}
