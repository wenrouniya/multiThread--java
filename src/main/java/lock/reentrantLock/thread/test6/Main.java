package lock.reentrantLock.thread.test6;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        String abc = new String("abc");
        ArrayList<Integer> integers = new ArrayList<>(100);

        ThreadA threadA = new ThreadA(abc, integers);
        threadA.start();

        ThreadB threadB = new ThreadB(abc, integers);
        threadB.start();
    }
}
