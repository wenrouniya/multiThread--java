package lock.reentrantLock.thread;

import sun.awt.windows.ThemeReader;

public class LoginServlet {
    private static String nameRef ;
    private static  String passwordRef ;
    public static synchronized void doPost(String name,String password) throws InterruptedException {
        nameRef=name;
        if(nameRef.equals("aa")){
            Thread.sleep(5);
        }
        passwordRef=password;
        System.out.println("nameRef  =" + nameRef+ "   passwordRef ="+ passwordRef );
    }


    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }

}
class  A extends  Thread{

    @Override
    public void run() {
        try {
            LoginServlet.doPost("aa","aaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class  B extends Thread{
    public void run(){
        try {
            LoginServlet.doPost("bb","bbb");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
