package lock.reentrantLock.thread.test7;


/**
 * 线程全部出现假死状态 原因即为 notify有可能连续唤醒同类
 * 解决方法： 不光唤醒同类 连同异类一起唤醒即可 即将notify 改为notifyAll
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        C c = new C(lock);
        P p = new P(lock);

       ThreadC[] threadCs= new ThreadC[2];
       ThreadP[] threadPs =new ThreadP[2];
       for(int i=0;i<2;i++){
           threadPs[i]=new ThreadP(p);
           threadPs[i].setName("生产者"+(i+1));
           threadPs[i].start();
           threadCs[i]=new ThreadC(c);
           threadCs[i].setName("消费者"+(i+1));
           threadCs[i].start();

       }
//       Thread.sleep(1000);
//       Thread [] threads=new Thread[Thread.currentThread().getThreadGroup().activeCount()];

//       for(int i=0;i<threads.length;i++){
//           System.out.println(
//                   threads[i].getName()+"  "+
//                           threads[i].getState()
//           );
//       }

    }
}
