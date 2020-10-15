package lock.reentrantLock.thread.test5;

import java.util.ArrayList;

public class ThreadA extends  Thread {


    private ArrayList<Integer>  list;
    public ThreadA(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {


        for(int i=0;i<100;i++){
            list.add(i);
            System.out.println("添加了第"+i+" 个元素");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
