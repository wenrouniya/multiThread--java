package lock.reentrantLock.thread.test5;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(101);
        ThreadA threadA = new ThreadA(integers);
        threadA.start();
        ThreadB threadB = new ThreadB(integers);
        threadB.start();
    }
}
