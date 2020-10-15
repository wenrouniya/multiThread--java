package lock.reentrantLock.thread.test3;

public class Ref {
    private int  num;

    public synchronized  void setName(String name){

        if(name.equals("a")){

            num=10;
            System.out.println("a set over");
        }else {
            num=20;
            System.out.println("b set over");
        }

        System.out.println(name +" num = " +num);
    }

}
