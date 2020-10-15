package lock.reentrantLock.thread.test5;

import java.util.ArrayList;

public class ThreadB extends  Thread {


    private ArrayList<Integer> list;

    public ThreadB(ArrayList<Integer> list){

        this.list=list;
    }

    @Override
    public void run() {
        super.run();

        while (true){
            if(list.size() ==5){
                System.out.println("有五个元素了 我要退出了 ");
            }

        }
    }
}
