package lock.reentrantLock.thread.test9;
public class Main {

    public static void main(String[] args) {
        Tools tools = new Tools();
        for(int i=0;i<50 ;i++){

            ThreadA threadA = new ThreadA(tools);
            ThreadB threadB = new ThreadB(tools);
            threadA.start();
            threadB.start();
        }

    }
}
